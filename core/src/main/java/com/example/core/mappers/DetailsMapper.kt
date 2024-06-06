package com.example.core.mappers

import com.example.core.model.CastUI
import com.example.core.model.MovieDetailUI
import com.example.detail.data.model.credit.Cast
import com.example.detail.data.model.detail.MovieDetail


fun MovieDetail.toMovieDetailUI(): MovieDetailUI {
    return MovieDetailUI(
        backDropPath = backDropPath,
        genres = genres,
        id = id,
        originalLanguage = originalLanguage,
        overview = overview,
        releaseDate = releaseDate,
        title = title,
        status = status
    )
}

fun Cast.toCastUI(): CastUI {
    return CastUI(
        name = originalName,
        character = character,
        profilePath = profilePath
    )
}