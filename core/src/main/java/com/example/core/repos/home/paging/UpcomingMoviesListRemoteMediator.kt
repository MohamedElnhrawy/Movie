package com.example.core.repos.home.paging

import com.example.core.local.database.MovieDatabase
import com.example.core.local.entity.UpcomingMovieEntity
import com.example.core.mappers.toLocalUpcoming
import com.example.core.remote.Result
import com.example.core.remote.datasource.MovieDataSource
import com.example.core.repos.paging.FIRST_PAGE
import com.example.core.repos.paging.base.mediator.BaseRemoteMediator

class UpcomingMoviesListRemoteMediator
    (
    private val remote: MovieDataSource,
    database: MovieDatabase,
    source: String
) : BaseRemoteMediator<UpcomingMovieEntity>( UpcomingMovieEntity::class,
    database,
    source = source,
    firstPageKey = FIRST_PAGE
   ){

    private val dao = database.upcomingMovieDao()

    override suspend fun loadPage(
        pageKey: Int,
        pageSize: Int
    ): Result<Pair<Int, List<UpcomingMovieEntity>>> {
        val result  = remote.getUpComingMovie(page = pageKey)

        return if (result is Result.Success) {
            val data = result.data
            val (totalCount, movies) =
                 data.totalResults to (data.movieResponses.map { it.toLocalUpcoming() } ?: emptyList())

            Result.Success((totalCount) to movies)
        } else {
            (result as? Result.Error) ?: Result.error()
        }
    }



    override fun getId(item: UpcomingMovieEntity): String = item.id.toString()

    override suspend fun savePage(
        pageData: List<UpcomingMovieEntity>,
        source: String,
    ) {
        dao.insertAll(pageData.map { it.copy(source = source) })
    }

    override suspend fun deleteAllSavedPages(source: String) {
        dao.deleteAllMoviesFromSource(source)
    }


}