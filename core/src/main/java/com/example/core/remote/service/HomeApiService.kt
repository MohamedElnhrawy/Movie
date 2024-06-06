package com.example.core.remote.service


import com.example.core.remote.response.Response
import com.example.core.remote.response.home.MovieResponse
import com.example.core.utils.Constants
import retrofit2.http.GET
import retrofit2.http.Query

interface HomeApiService {
    @GET("movie/upcoming")
    suspend fun getUpComingMovie(
        @Query("api_key") apiKey: String = Constants.API_KEY,
        @Query("language") language: String = Constants.LANGUAGE,
        @Query("page") page: Int = 1
    ): MovieResponse

    @GET("movie/popular")
    suspend fun getPopularMovie(
        @Query("api_key") apiKey: String = Constants.API_KEY,
        @Query("language") language: String = Constants.LANGUAGE,
        @Query("page") page: Int = 1
    ): MovieResponse

    @GET("movie/now_playing")
    suspend fun getNowPlayingMovie(
        @Query("api_key") apiKey: String = Constants.API_KEY,
        @Query("language") language: String = Constants.LANGUAGE,
        @Query("page") page: Int = 1
    ): MovieResponse

}
