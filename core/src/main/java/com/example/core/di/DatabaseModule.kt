package com.example.core.di

import android.app.Application
import com.example.core.local.database.DatabaseWrapper
import com.example.core.local.database.MovieDatabase
import com.example.domain.BuildConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabaseWrapper(): DatabaseWrapper {
        return DatabaseWrapper()
    }

    @Singleton
    @Provides
    fun provideMovieDatabase(
        application: Application,
        databaseWrapper: DatabaseWrapper
    ): MovieDatabase {

        return databaseWrapper.databaseBuilder(
            application,
            MovieDatabase::class.java,
            BuildConfig.DATABASE_NAME,
        )
            .build()
    }

    @Provides
    @Singleton
    fun provideTransactionsPageKeysDao(database: MovieDatabase) = database.pageKeysDao()

    @Provides
    @Singleton
    fun providePopularMovieDao(database: MovieDatabase) = database.popularMovieDao()

    @Provides
    @Singleton
    fun provideUpcomingMovieDao(database: MovieDatabase) = database.upcomingMovieDao()

    @Provides
    @Singleton
    fun providePlayingMovieDao(database: MovieDatabase) = database.playingMovieDao()

    @Provides
    @Singleton
    fun provideTotalCountDao(database: MovieDatabase) = database.totalCountDao()

}