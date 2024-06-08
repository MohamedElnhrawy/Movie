package com.example.core.mappers

import com.example.core.local.entity.PlayingMovieEntity
import com.example.core.local.entity.PopularMovieEntity
import com.example.core.local.entity.UpcomingMovieEntity
import com.example.core.model.ResultHomeUI
import com.example.core.remote.response.home.MovieResponse


fun PlayingMovieEntity.toResultHomeUI(): ResultHomeUI {
    return ResultHomeUI(
        id = id,
        posterPath = posterPath,
        title = title
    )
}

fun MovieResponse.toLocalPlaying(): PlayingMovieEntity {
    return PlayingMovieEntity(
        id = id,
        originalTitle = originalTitle,
        posterPath = posterPath,
        title = title,
        voteCount = voteCount,
        voteAverage = voteAverage,
        releaseDate = releaseDate,
        backdropPath = backdropPath,
    )
}

fun MovieResponse.toLocalPopular(): PopularMovieEntity {
    return PopularMovieEntity(
        id = id,
        originalTitle = originalTitle,
        posterPath = posterPath,
        title = title,
        voteCount = voteCount,
        voteAverage = voteAverage,
        releaseDate = releaseDate,
        backdropPath = backdropPath,
    )
}

fun MovieResponse.toLocalUpcoming(): UpcomingMovieEntity {
    return UpcomingMovieEntity(
        id = id,
        originalTitle = originalTitle,
        posterPath = posterPath,
        title = title,
        voteCount = voteCount,
        voteAverage = voteAverage,
        releaseDate = releaseDate,
        backdropPath = backdropPath,
    )
}