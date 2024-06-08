package com.example.core.repos.paging.base.mediator


import androidx.room.withTransaction
import com.example.core.local.database.MovieDatabase
import com.example.core.local.entity.PageKey
import com.example.core.local.entity.TotalCount
import com.example.core.repos.paging.FIRST_PAGE
import com.example.core.repos.paging.utils.PagingException
import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadType
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import com.example.core.remote.Result
import kotlin.reflect.KClass

@OptIn(ExperimentalPagingApi::class)
abstract class BaseRemoteMediator<T : Any>(
    private val classT: KClass<T>,
    private val database: MovieDatabase,
    private val source: String,
    private val firstPageKey: Int = FIRST_PAGE,
) : RemoteMediator<Int, T>() {
    private val keysDao = database.pageKeysDao()
    private val totalCountDao = database.totalCountDao()

    private val classHash: Int by lazy {
        classT.java.name.hashCode()
    }

    override suspend fun initialize(): InitializeAction = InitializeAction.LAUNCH_INITIAL_REFRESH

    abstract suspend fun loadPage(
        pageKey: Int,
        pageSize: Int,
    ): Result<Pair<Int, List<T>>>

    abstract suspend fun savePage(
        pageData: List<T>,
        source: String,
    )

    abstract suspend fun deleteAllSavedPages(source: String)

    abstract fun getId(item: T): String

    @Suppress("ReturnCount")
    override suspend fun load(
        loadType: LoadType,
        state: PagingState<Int, T>,
    ): MediatorResult {
        val pageKey =
            when (loadType) {
                LoadType.REFRESH -> getPageKeyClosestToCurrentPosition(state)?.pageKey ?: firstPageKey
                LoadType.PREPEND -> {
                    val pageKey = getPageKeyForFirstItem(state)
                    pageKey?.pageKey?.minus(1)?.takeIf { it >= firstPageKey }
                        ?: return MediatorResult.Success(endOfPaginationReached = pageKey != null)
                }
                LoadType.APPEND -> {
                    val pageKey = getPageKeyForLastItem(state)
                    pageKey?.pageKey?.plus(1)
                        ?: return MediatorResult.Success(endOfPaginationReached = pageKey != null)
                }
            }

        try {
            return when (val pageResult = loadPage(pageKey, state.config.pageSize)) {
                is Result.Success -> {
                    val pageData = pageResult.data
                    val totalCount = pageData.first
                    val items = pageData.second

                    database.withTransaction {
                        if (loadType == LoadType.REFRESH) {
                            clearDB(classHash, source)
                        }

                        saveData(items, totalCount, pageKey)
                    }

                    MediatorResult.Success(endOfPaginationReached = items.isEmpty())
                }
                else ->
                    MediatorResult.Error(
                        (pageResult as? Result.Error)?.let {
                            PagingException(it.errorCode, it.errorCause, it.errorMessage)
                        } ?: PagingException(),
                    )
            }
        } catch (t: Exception) {
            return MediatorResult.Error(t)
        }
    }

    private suspend fun getPageKeyClosestToCurrentPosition(state: PagingState<Int, T>): PageKey? =
        state.anchorPosition?.let { position ->
            state.closestItemToPosition(position)?.let { item -> getId(item) }?.let { key ->
                keysDao.getPageKey(key, classHash, source)
            }
        }

    private suspend fun getPageKeyForFirstItem(state: PagingState<Int, T>): PageKey? =
        state.pages.firstOrNull { it.data.isNotEmpty() }?.data?.first()?.let { item -> getId(item) }?.let { key ->
            keysDao.getPageKey(key, classHash, source)
        }

    private suspend fun getPageKeyForLastItem(state: PagingState<Int, T>): PageKey? =
        state.pages.lastOrNull { it.data.isNotEmpty() }?.data?.last()?.let { item -> getId(item) }?.let { key ->
            keysDao.getPageKey(key, classHash, source)
        }

    private suspend fun saveData(
        items: List<T>,
        totalCount: Int,
        pageKey: Int,
    ) {
        savePageKeys(items, pageKey)
        savePage(items, source)
        saveTotalCount(totalCount, source, pageKey)
    }

    private suspend fun saveTotalCount(
        totalCount: Int,
        source: String,
        pageKey: Int,
    ) {
        if (totalCount > 0 || pageKey == firstPageKey) {
            totalCountDao.insertTotalCount(TotalCount(source, totalCount))
        }
    }

    private suspend fun clearDB(
        classHash: Int,
        source: String,
    ) {
        keysDao.deleteKeysByClassHash(classHash, source)
        totalCountDao.deleteTotalCountById(source)
        deleteAllSavedPages(source)
    }

    private suspend fun savePageKeys(
        items: List<T>,
        pageKey: Int,
    ) {
        items.mapIndexed { index, item ->
            PageKey(
                itemId = getId(item),
                pageKey = pageKey,
                classHash = classHash,
                source = source,
                itemOrder = index,
            )
        }.also { keys ->
            keysDao.insertKeys(keys)
        }
    }
}
