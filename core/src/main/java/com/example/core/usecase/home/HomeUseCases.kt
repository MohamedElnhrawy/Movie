package com.example.core.usecase.home

data class HomeUseCases(
    val getPopularMovieUseCase: GetPopularMovieUseCase,
    val getNowPlayingMovieUseCase: GetNowPlayingMovieUseCase,
    val getUpcomingMovieUseCase: GetUpcomingMovieUseCase
)
