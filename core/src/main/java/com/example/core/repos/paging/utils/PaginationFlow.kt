package com.example.core.repos.paging.utils

import android.content.ContentValues.TAG
import android.util.Log
import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.PagingSource
import androidx.paging.cachedIn
import com.example.core.local.dao.TotalCountDao
import com.example.core.repos.paging.INITIAL_LOADED_PAGES
import com.example.core.repos.paging.PAGE_SIZE
import com.example.core.repos.paging.base.mediator.BaseRemoteMediator
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.count
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map

sealed class PagingDataWithSource<out T : Any> {
    data class Success<T : Any>(
        val pagingData: PagingData<T>,
        val source: String,
        val totalCount: Int
    ) : PagingDataWithSource<T>()

    data class Error(val throwable: Throwable) : PagingDataWithSource<Nothing>()

    object Loading : PagingDataWithSource<Nothing>()
}

//fun <T : Any, R : Any> PagingDataWithSource<T>.map(mapper: (PagingData<T>) -> PagingData<R>): PagingDataWithSource<R> =
//    PagingDataWithSource(mapper(pagingData), source, totalCount)

//class EmptyPagingFlow<T : Any>(
//    instance: MutableStateFlow<PagingDataWithSource<T>> = MutableStateFlow(PagingDataWithSource()),
//) : MutableStateFlow<PagingDataWithSource<T>> by instance

@OptIn(ExperimentalPagingApi::class)
fun <T : Any> createPagingFlow(
    remoteMediator: BaseRemoteMediator<T>,
    pagingSourceFactory: () -> PagingSource<Int, T>,
    totalCountDao: TotalCountDao,
    scope: CoroutineScope,
    source: String,
): Flow<PagingDataWithSource<T>> {
    return try {
        Pager(
            config =
            PagingConfig(
                pageSize = PAGE_SIZE,
                enablePlaceholders = false,
                initialLoadSize = PAGE_SIZE * INITIAL_LOADED_PAGES,
            ),
            remoteMediator = remoteMediator,
            pagingSourceFactory = pagingSourceFactory,
        ).flow.cachedIn(scope)
            .combine(totalCountDao.getTotalCountById(source)) { data, count ->
                PagingDataWithSource.Success(
                    pagingData = data,
                    source = source,
                    totalCount = count?.count ?: 0,
                )
            }.distinctUntilChanged()
    } catch (e: Exception) {
        Log.e(TAG, "Error in paging flow: $e")
        // Emitting an error state
        flow { emit(PagingDataWithSource.Error(e)) }

    }
}


//fun <T : Any> createPagingFlow(
//    pagingSource: PagingSource<Int, T>,
//    scope: CoroutineScope,
//): Flow<PagingDataWithSource<T>> =
//    Pager(
//        config =
//        PagingConfig(
//            pageSize = PAGE_SIZE,
//            enablePlaceholders = false,
//            initialLoadSize = PAGE_SIZE * INITIAL_LOADED_PAGES,
//        ),
//        pagingSourceFactory = { pagingSource },
//    ).flow.cachedIn(scope).map {
//        PagingDataWithSource.Success(pagingData = it)
//    }.distinctUntilChanged()
