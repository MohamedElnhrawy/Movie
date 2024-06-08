package com.example.core.repos.home

import com.example.core.local.entity.PlayingMovieEntity
import com.example.core.local.entity.PopularMovieEntity
import com.example.core.local.entity.UpcomingMovieEntity
import kotlinx.coroutines.flow.Flow
import com.example.core.repos.paging.utils.PagingDataWithSource
import kotlinx.coroutines.CoroutineScope


interface MovieRepository {

     fun getUpComingMovies(scope: CoroutineScope,) : Flow<PagingDataWithSource<UpcomingMovieEntity>>

     fun getPopularMovies(scope: CoroutineScope,) : Flow<PagingDataWithSource<PopularMovieEntity>>

     fun getNowPlayingMovies(scope: CoroutineScope,) : Flow<PagingDataWithSource<PlayingMovieEntity>>
}