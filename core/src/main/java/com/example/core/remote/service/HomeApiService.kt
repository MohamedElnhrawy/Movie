package com.example.core.remote.service


import com.example.core.remote.response.home.MoviesResponse
import com.example.core.utils.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface HomeApiService {
    @GET("movie/upcoming")
    suspend fun getUpComingMovie(
        @Query("api_key") apiKey: String = Constants.API_KEY,
        @Query("language") language: String = Constants.LANGUAGE,
        @Query("page") page: Int = 1
    ): Response<MoviesResponse>

    @GET("movie/popular")
    suspend fun getPopularMovie(
        @Query("api_key") apiKey: String = Constants.API_KEY,
        @Query("language") language: String = Constants.LANGUAGE,
        @Query("page") page: Int = 1
    ): Response<MoviesResponse>

    @GET("movie/now_playing")
    suspend fun getNowPlayingMovie(
        @Query("api_key") apiKey: String = Constants.API_KEY,
        @Query("language") language: String = Constants.LANGUAGE,
        @Query("page") page: Int = 1
    ): Response<MoviesResponse>

}
