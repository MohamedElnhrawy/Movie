package com.example.core.usecase.details

import com.example.core.mappers.toCastUI
import com.example.core.remote.response.Response
import com.example.core.repos.details.DetailMovieRepository
import kotlinx.coroutines.flow.flow

class GetCastUseCase(
    val detailMovieRepository: DetailMovieRepository
) {
    operator fun invoke(movieId: Int) = flow {
        try {
            emit(Response.Loading)
            val result = detailMovieRepository.getCredit(movieId = movieId).cast.map { it.toCastUI() }
            emit(Response.Success(result))
        } catch (e: Exception) {
            emit(Response.Error(e.localizedMessage ?: "Unexpected Error!"))
        }
    }
}