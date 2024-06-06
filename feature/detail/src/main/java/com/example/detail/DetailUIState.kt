package com.example.detail

import com.example.core.model.MovieDetailUI

data class DetailUIState(
    var movie : MovieDetailUI? = null,
    var isLoading : Boolean = false,
    var error : String = ""
)
