package com.example.core.remote.service

import com.example.core.utils.Constants
import com.example.detail.data.model.credit.Credit
import com.example.core.remote.response.detail.MovieDetail
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface DetailApiService {

    @GET("movie/{movie_id}")
    suspend fun getMovieDetail(
        @Path("movie_id") movieId: Int,
        @Query("api_key") apiKey: String = Constants.API_KEY,
        @Query("language") language: String = Constants.LANGUAGE,
    ): MovieDetail

    @GET("movie/{movie_id}/credits")
    suspend fun getCredit(
        @Path("movie_id") movieId: Int,
        @Query("api_key") apiKey: String = Constants.API_KEY,
        @Query("language") language: String = Constants.LANGUAGE,
    ): Credit
}