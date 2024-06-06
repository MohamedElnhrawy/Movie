package com.example.core.usecase.home

import androidx.paging.PagingData
import com.example.core.repos.home.MovieRepository
import com.example.core.remote.response.home.Result
import kotlinx.coroutines.flow.Flow

class GetPopularMovieUseCase(
    private val movieRepository: MovieRepository
) {
    operator fun invoke(): Flow<PagingData<Result>> {
        return movieRepository.getPopularMovies()
    }
}