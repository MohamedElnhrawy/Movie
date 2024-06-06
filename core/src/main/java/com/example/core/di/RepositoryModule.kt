package com.example.core.di

import com.example.core.remote.service.DetailApiService
import com.example.core.remote.service.HomeApiService
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
    fun provideMovieRepository(apiService: HomeApiService): MovieRepository {
        return MovieRepositoryImpl(apiService = apiService)
    }






    @Provides
    @Singleton
    fun provideDetailMovieRepository(detailApiService: DetailApiService): DetailMovieRepository {
        return DetailMovieRepositoryImpl(detailApiService = detailApiService)
    }

}