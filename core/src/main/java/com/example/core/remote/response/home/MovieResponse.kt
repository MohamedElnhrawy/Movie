package com.example.core.remote.response.home

import com.google.gson.annotations.SerializedName

data class MovieResponse(
    val page: Int,
    val results: List<Result>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)