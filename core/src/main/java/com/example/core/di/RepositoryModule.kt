package com.example.core.di

import com.example.core.local.database.MovieDatabase
import com.example.core.remote.datasource.MovieDataSource
import com.example.core.remote.service.DetailApiService
import com.example.core.repos.details.DetailMovieRepository
import com.example.core.repos.details.DetailMovieRepositoryImpl
import com.example.core.repos.home.MovieRepository
import com.example.core.repos.home.MovieRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {


    @Provides
    @Singleton
    fun provideMovieRepository(dataSource: MovieDataSource,movieDatabase:MovieDatabase): MovieRepository {
        return MovieRepositoryImpl(dataSource = dataSource, database = movieDatabase)
    }






    @Provides
    @Singleton
    fun provideDetailMovieRepository(detailApiService: DetailApiService): DetailMovieRepository {
        return DetailMovieRepositoryImpl(detailApiService = detailApiService)
    }

}