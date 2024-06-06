package com.example.core.di;

import com.example.core.remote.service.DetailApiService;
import com.example.core.remote.service.HomeApiService;
import com.example.core.repos.details.DetailMovieRepository;
import com.example.core.repos.details.DetailMovieRepositoryImpl;
import com.example.core.repos.home.MovieRepository;
import com.example.core.repos.home.MovieRepositoryImpl;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/example/core/di/RepositoryModule;", "", "()V", "provideDetailMovieRepository", "Lcom/example/core/repos/details/DetailMovieRepository;", "detailApiService", "Lcom/example/core/remote/service/DetailApiService;", "provideMovieRepository", "Lcom/example/core/repos/home/MovieRepository;", "apiService", "Lcom/example/core/remote/service/HomeApiService;", "core_debug"})
@dagger.Module
public final class RepositoryModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.core.di.RepositoryModule INSTANCE = null;
    
    private RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.core.repos.home.MovieRepository provideMovieRepository(@org.jetbrains.annotations.NotNull
    com.example.core.remote.service.HomeApiService apiService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.core.repos.details.DetailMovieRepository provideDetailMovieRepository(@org.jetbrains.annotations.NotNull
    com.example.core.remote.service.DetailApiService detailApiService) {
        return null;
    }
}