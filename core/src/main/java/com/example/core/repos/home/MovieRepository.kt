package com.example.core.repos.home

import androidx.paging.PagingData
import kotlinx.coroutines.flow.Flow
import com.example.core.remote.response.home.Result


interface MovieRepository {

     fun getUpComingMovies() : Flow<PagingData<Result>>

     fun getPopularMovies() : Flow<PagingData<Result>>

     fun getNowPlayingMovies() : Flow<PagingData<Result>>
}