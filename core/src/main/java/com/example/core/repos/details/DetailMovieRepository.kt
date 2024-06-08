package com.example.core.repos.details

import com.example.detail.data.model.credit.Credit
import com.example.core.remote.response.detail.MovieDetail

interface DetailMovieRepository {

    suspend fun getCredit(movieId : Int) : Credit

    suspend fun getMovieDetail(movieId : Int) : MovieDetail

}