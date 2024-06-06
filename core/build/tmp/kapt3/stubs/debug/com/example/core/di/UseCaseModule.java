package com.example.core.di;

import com.example.core.repos.details.DetailMovieRepository;
import com.example.core.repos.home.MovieRepository;
import com.example.core.usecase.details.DetailUseCases;
import com.example.core.usecase.details.GetCastUseCase;
import com.example.core.usecase.details.GetMovieDetailUseCase;
import com.example.core.usecase.home.GetNowPlayingMovieUseCase;
import com.example.core.usecase.home.GetPopularMovieUseCase;
import com.example.core.usecase.home.GetUpcomingMovieUseCase;
import com.example.core.usecase.home.HomeUseCases;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/example/core/di/UseCaseModule;", "", "()V", "provideDetailUseCases", "Lcom/example/core/usecase/details/DetailUseCases;", "detailMovieRepository", "Lcom/example/core/repos/details/DetailMovieRepository;", "provideHomeUseCases", "Lcom/example/core/usecase/home/HomeUseCases;", "movieRepository", "Lcom/example/core/repos/home/MovieRepository;", "core_debug"})
@dagger.Module
public final class UseCaseModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.core.di.UseCaseModule INSTANCE = null;
    
    private UseCaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.core.usecase.home.HomeUseCases provideHomeUseCases(@org.jetbrains.annotations.NotNull
    com.example.core.repos.home.MovieRepository movieRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.core.usecase.details.DetailUseCases provideDetailUseCases(@org.jetbrains.annotations.NotNull
    com.example.core.repos.details.DetailMovieRepository detailMovieRepository) {
        return null;
    }
}