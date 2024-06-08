package com.example.core.repos.home

import com.example.core.local.dao.PlayingMovieDao
import com.example.core.local.dao.PopularMovieDao
import com.example.core.local.dao.UpcomingMovieDao
import com.example.core.local.database.MovieDatabase
import com.example.core.local.entity.PlayingMovieEntity
import com.example.core.local.entity.PopularMovieEntity
import com.example.core.local.entity.UpcomingMovieEntity
import com.example.core.remote.datasource.MovieDataSource
import com.example.core.repos.home.paging.PlayingMoviesListRemoteMediator
import com.example.core.repos.home.paging.PopularMoviesListRemoteMediator
import com.example.core.repos.home.paging.UpcomingMoviesListRemoteMediator
import com.example.core.repos.paging.utils.PagingDataWithSource
import com.example.core.repos.paging.utils.createPagingFlow
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class MovieRepositoryImpl(
    private val database: MovieDatabase,
    private val dataSource: MovieDataSource
) : MovieRepository {
    private val popularMovieDao: PopularMovieDao = database.popularMovieDao()
    private val upcomingMovieDao: UpcomingMovieDao = database.upcomingMovieDao()
    private val playingMovieDao: PlayingMovieDao = database.playingMovieDao()


    override fun getUpComingMovies(scope: CoroutineScope): Flow<PagingDataWithSource<UpcomingMovieEntity>> {
        val source = MovieType.UPCOMING.name

        return createPagingFlow(
            remoteMediator =
            UpcomingMoviesListRemoteMediator(
                dataSource,
                database,
                source
            ),
            pagingSourceFactory = { upcomingMovieDao.listMovies(source) },
            scope = scope,
            source = source,
            totalCountDao = database.totalCountDao(),
        )
    }

    override fun getPopularMovies(scope: CoroutineScope): Flow<PagingDataWithSource<PopularMovieEntity>> {
        val source = MovieType.POPULAR.name
        return createPagingFlow(
            remoteMediator =
            PopularMoviesListRemoteMediator(
                dataSource,
                database,
                source
            ),
            pagingSourceFactory = { popularMovieDao.listMovies(source) },
            scope = scope,
            source = source,
            totalCountDao = database.totalCountDao(),
        )
    }

    override fun getNowPlayingMovies(scope: CoroutineScope): Flow<PagingDataWithSource<PlayingMovieEntity>> {
        val source = MovieType.NOW_PLAYING.name
        return createPagingFlow(
            remoteMediator =
            PlayingMoviesListRemoteMediator(
                dataSource,
                database,
                source
            ),
            pagingSourceFactory = { playingMovieDao.listMovies(source) },
            scope = scope,
            source = source,
            totalCountDao = database.totalCountDao(),
        )
    }
}

enum class MovieType {
    NOW_PLAYING,
    POPULAR,
    UPCOMING
}