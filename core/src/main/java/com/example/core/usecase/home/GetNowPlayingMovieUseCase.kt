package com.example.core.usecase.home

import androidx.paging.PagingData
import com.example.core.remote.response.home.Result
import com.example.core.repos.home.MovieRepository
import kotlinx.coroutines.flow.Flow

class GetNowPlayingMovieUseCase(
    private val movieRepository: MovieRepository
) {
    operator fun invoke(): Flow<PagingData<Result>> {
        return movieRepository.getNowPlayingMovies()
    }
}