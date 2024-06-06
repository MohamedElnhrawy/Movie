package com.example.core.mappers

import com.example.core.model.ResultHomeUI
import com.example.core.remote.response.home.Result


fun Result.toResultHomeUI(): ResultHomeUI {
    return ResultHomeUI(
        id = id,
        posterPath = posterPath,
        title = title
    )
}