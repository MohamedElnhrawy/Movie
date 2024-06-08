package com.example.core.usecase.home

import com.example.core.local.entity.PopularMovieEntity
import com.example.core.repos.home.MovieRepository
import com.example.core.repos.paging.utils.PagingDataWithSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow

class GetPopularMovieUseCase(
    private val movieRepository: MovieRepository
) {
    operator fun invoke(scope: CoroutineScope): Flow<PagingDataWithSource<PopularMovieEntity>> {
        return movieRepository.getPopularMovies(scope)
    }
}