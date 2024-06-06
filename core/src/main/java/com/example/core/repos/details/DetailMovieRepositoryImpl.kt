package com.example.core.repos.details

import com.example.core.remote.service.DetailApiService
import com.example.detail.data.model.credit.Credit
import com.example.detail.data.model.detail.MovieDetail
class DetailMovieRepositoryImpl (
    private val detailApiService: DetailApiService
) : DetailMovieRepository {
    override suspend fun getMovieDetail(movieId: Int): MovieDetail {
        return detailApiService.getMovieDetail(movieId = movieId)
    }

    override suspend fun getCredit(movieId: Int): Credit {
        return detailApiService.getCredit(movieId = movieId)
    }
}