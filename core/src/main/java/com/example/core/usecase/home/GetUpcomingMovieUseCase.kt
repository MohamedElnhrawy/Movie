package com.example.core.usecase.home

import com.example.core.local.entity.UpcomingMovieEntity
import com.example.core.repos.home.MovieRepository
import com.example.core.repos.paging.utils.PagingDataWithSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow

class GetUpcomingMovieUseCase(
    private val movieRepository: MovieRepository
) {

     operator fun invoke(scope: CoroutineScope): Flow<PagingDataWithSource<UpcomingMovieEntity>> {
        return movieRepository.getUpComingMovies(scope)
    }
}