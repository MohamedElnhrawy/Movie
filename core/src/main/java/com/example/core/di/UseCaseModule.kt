package com.example.core.di

import com.example.core.repos.details.DetailMovieRepository
import com.example.core.repos.home.MovieRepository
import com.example.core.usecase.details.DetailUseCases
import com.example.core.usecase.details.GetCastUseCase
import com.example.core.usecase.details.GetMovieDetailUseCase
import com.example.core.usecase.home.GetNowPlayingMovieUseCase
import com.example.core.usecase.home.GetPopularMovieUseCase
import com.example.core.usecase.home.GetUpcomingMovieUseCase
import com.example.core.usecase.home.HomeUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    @Singleton
    fun provideHomeUseCases(
        movieRepository: MovieRepository,
    ): HomeUseCases {
        return HomeUseCases(
            getNowPlayingMovieUseCase = GetNowPlayingMovieUseCase(
                movieRepository = movieRepository
            ),
            getPopularMovieUseCase = GetPopularMovieUseCase(
                movieRepository = movieRepository
            ),
            getUpcomingMovieUseCase = GetUpcomingMovieUseCase(
                movieRepository = movieRepository
            )
        )
    }

    @Provides
    @Singleton
    fun provideDetailUseCases(
        detailMovieRepository: DetailMovieRepository,
    ): DetailUseCases {
        return DetailUseCases(
            getCastUseCase = GetCastUseCase(
                detailMovieRepository = detailMovieRepository
            ),
            getMovieDetailUseCase = GetMovieDetailUseCase(
                detailMovieRepository = detailMovieRepository
            ),
        )
    }

}


