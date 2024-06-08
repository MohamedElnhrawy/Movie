package com.example.core.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "playing_movie")
data class PlayingMovieEntity(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "original_title") val originalTitle: String,
    @ColumnInfo(name = "poster_path") val posterPath: String,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "vote_count") val voteCount: Int,
    @ColumnInfo(name = "vote_average") val voteAverage: Double,
    @ColumnInfo(name = "release_date") val releaseDate: String,
    @ColumnInfo(name = "backdrop_path") val backdropPath: String,
    @ColumnInfo(name = "source") var source: String? = null,

)

@Entity(tableName = "popular_movie")
data class PopularMovieEntity(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "original_title") val originalTitle: String,
    @ColumnInfo(name = "poster_path") val posterPath: String,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "vote_count") val voteCount: Int,
    @ColumnInfo(name = "vote_average") val voteAverage: Double,
    @ColumnInfo(name = "release_date") val releaseDate: String,
    @ColumnInfo(name = "backdrop_path") val backdropPath: String,
    @ColumnInfo(name = "source") var source: String? = null,

    )

@Entity(tableName = "upcoming_movie")
data class UpcomingMovieEntity(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "original_title") val originalTitle: String,
    @ColumnInfo(name = "poster_path") val posterPath: String,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "vote_count") val voteCount: Int,
    @ColumnInfo(name = "vote_average") val voteAverage: Double,
    @ColumnInfo(name = "release_date") val releaseDate: String,
    @ColumnInfo(name = "backdrop_path") val backdropPath: String,
    @ColumnInfo(name = "source") var source: String? = null,

    )
