package com.example.core.usecase.details

import com.example.core.mappers.toMovieDetailUI
import com.example.core.remote.response.Response
import com.example.core.repos.details.DetailMovieRepository
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException

class GetMovieDetailUseCase(
    val detailMovieRepository: DetailMovieRepository
) {
    operator fun invoke(movieId: Int) = flow {
        return@flow try {
            emit(Response.Loading)
            val result = detailMovieRepository.getMovieDetail(movieId = movieId).toMovieDetailUI()
            emit(Response.Success(result))
        } catch (e: Exception) {
            emit(Response.Error(e.localizedMessage ?: "Unexpected Error!"))
        } catch (e: HttpException) {
            emit(Response.Error(e.localizedMessage ?: "Unexpected Error!"))
        }
    }
}