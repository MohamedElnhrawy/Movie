package com.example.core.repos.home.paging

import com.example.core.local.database.MovieDatabase
import com.example.core.local.entity.PopularMovieEntity
import com.example.core.mappers.toLocalPopular
import com.example.core.remote.Result
import com.example.core.remote.datasource.MovieDataSource
import com.example.core.repos.paging.FIRST_PAGE
import com.example.core.repos.paging.base.mediator.BaseRemoteMediator

class PopularMoviesListRemoteMediator
    (
    private val remote: MovieDataSource,
    database: MovieDatabase,
    source: String
) : BaseRemoteMediator<PopularMovieEntity>( PopularMovieEntity::class,
    database,
    source = source,
    firstPageKey = FIRST_PAGE
   ){

    private val dao = database.popularMovieDao()

    override suspend fun loadPage(
        pageKey: Int,
        pageSize: Int
    ): Result<Pair<Int, List<PopularMovieEntity>>> {
        val result  = remote.getPopularMovie(page = pageKey)


        return if (result is Result.Success) {
            val data = result.data
            val (totalCount, movies) =
                 data.totalResults to (data.movieResponses.map { it.toLocalPopular() } ?: emptyList())

            Result.Success((totalCount) to movies)
        } else {
            (result as? Result.Error) ?: Result.error()
        }
    }



    override fun getId(item: PopularMovieEntity): String = item.id.toString()

    override suspend fun savePage(
        pageData: List<PopularMovieEntity>,
        source: String,
    ) {
        dao.insertAll(pageData.map { it.copy(source = source) })
    }

    override suspend fun deleteAllSavedPages(source: String) {
        dao.deleteAllMoviesFromSource(source)
    }


}