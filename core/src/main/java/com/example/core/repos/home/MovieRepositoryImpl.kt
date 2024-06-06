package com.example.core.repos.home

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.core.remote.datasource.MovieDataSource
import kotlinx.coroutines.flow.Flow
import com.example.core.remote.response.home.Result
import com.example.core.remote.service.HomeApiService

class MovieRepositoryImpl(private val apiService: HomeApiService) : MovieRepository {
    override fun getUpComingMovies(): Flow<PagingData<Result>> {
        return Pager(
            config = PagingConfig(
                pageSize = 3,
            ),
            pagingSourceFactory = {
                MovieDataSource(
                    apiService = apiService,
                    movieType = MovieType.UPCOMING
                )
            },
        ).flow
    }

    override fun getPopularMovies(): Flow<PagingData<Result>> {
        return Pager(
            config = PagingConfig(
                pageSize = 3,
            ),
            pagingSourceFactory = {
                MovieDataSource(
                    apiService = apiService,
                    movieType = MovieType.POPULAR
                )
            },
        ).flow
    }

    override fun getNowPlayingMovies(): Flow<PagingData<Result>> {
        return Pager(
            config = PagingConfig(
                pageSize = 1
            ),
            pagingSourceFactory = {
                MovieDataSource(
                    apiService = apiService,
                    movieType = MovieType.NOW_PLAYING
                )
            }
        ).flow
    }
}

enum class MovieType {
    NOW_PLAYING,
    POPULAR,
    UPCOMING
}