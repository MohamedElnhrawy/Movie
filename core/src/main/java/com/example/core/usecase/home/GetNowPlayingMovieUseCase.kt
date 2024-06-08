package com.example.core.usecase.home

import com.example.core.local.entity.PlayingMovieEntity
import com.example.core.repos.home.MovieRepository
import com.example.core.repos.paging.utils.PagingDataWithSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow

class GetNowPlayingMovieUseCase(
    private val movieRepository: MovieRepository
) {
    operator fun invoke(scope: CoroutineScope): Flow<PagingDataWithSource<PlayingMovieEntity>> {
        return movieRepository.getNowPlayingMovies(scope)
    }
}