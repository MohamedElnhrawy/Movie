package com.example.home.component.model

import com.example.core.local.entity.PlayingMovieEntity
import com.example.core.local.entity.PopularMovieEntity
import com.example.core.local.entity.UpcomingMovieEntity

data class HomeUI(
    val id: Int,
    val posterPath: String,
    val title: String,

    )

fun PopularMovieEntity.toUI() =
     HomeUI(id=id,posterPath=posterPath,title=title)
fun UpcomingMovieEntity.toUI() =
    HomeUI(id=id,posterPath=posterPath,title=title)
fun PlayingMovieEntity.toUI() =
    HomeUI(id=id,posterPath=posterPath,title=title)