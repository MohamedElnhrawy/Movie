package com.example.core.repos.home.paging

import com.example.core.local.database.MovieDatabase
import com.example.core.local.entity.PlayingMovieEntity
import com.example.core.mappers.toLocalPlaying
import com.example.core.remote.Result
import com.example.core.remote.datasource.MovieDataSource
import com.example.core.repos.paging.FIRST_PAGE
import com.example.core.repos.paging.base.mediator.BaseRemoteMediator

class PlayingMoviesListRemoteMediator
    (
    private val remote: MovieDataSource,
    database: MovieDatabase,
    source: String
) : BaseRemoteMediator<PlayingMovieEntity>(
    PlayingMovieEntity::class,
    database,
    source = source,
    firstPageKey = FIRST_PAGE
) {

    private val dao = database.playingMovieDao()

    override suspend fun loadPage(
        pageKey: Int,
        pageSize: Int
    ): Result<Pair<Int, List<PlayingMovieEntity>>> {
        val result = remote.getNowPlayingMovie(page = pageKey)
        try {
            return if (result is Result.Success) {
                val data = result.data
                val (totalCount, movies) =
                    data.totalResults to data.movieResponses.map { it.toLocalPlaying() }

                Result.Success((totalCount) to movies)
            } else {
                (result as? Result.Error) ?: Result.error()
            }
        } catch (e: Exception) {
            return Result.Error(
                errorCause = e.cause,
                errorMessage = e.message ?: e.localizedMessage
            )
        }
    }


    override fun getId(item: PlayingMovieEntity): String = item.id.toString()

    override suspend fun savePage(
        pageData: List<PlayingMovieEntity>,
        source: String,
    ) {
        dao.insertAll(pageData.map { it.copy(source = source) })
    }

    override suspend fun deleteAllSavedPages(source: String) {
        dao.deleteAllMoviesFromSource(source)
    }


}