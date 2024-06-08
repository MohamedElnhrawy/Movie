package com.example.core.remote.datasource

import com.example.core.SingleEvent
import com.example.core.remote.service.HomeApiService
import com.squareup.moshi.Moshi
import kotlinx.coroutines.flow.MutableStateFlow

class MovieDataSource(
    private val apiService: HomeApiService,
    moshi: Moshi,
    tokenExpirationFlow: MutableStateFlow<SingleEvent<Long>>,
) : BaseDataSource(moshi, tokenExpirationFlow)  {

    suspend fun getUpComingMovie(page: Int) =
        getResult {
            apiService.getUpComingMovie(page=page)
        }
    suspend fun getPopularMovie(page: Int) =
        getResult {
            apiService.getPopularMovie(page=page)
        }
    suspend fun getNowPlayingMovie(page: Int) =
        getResult {
            apiService.getNowPlayingMovie(page=page)
        }
}