package com.example.core.repos.home;

import com.example.core.local.dao.PlayingMovieDao;
import com.example.core.local.dao.PopularMovieDao;
import com.example.core.local.dao.UpcomingMovieDao;
import com.example.core.local.database.MovieDatabase;
import com.example.core.local.entity.PlayingMovieEntity;
import com.example.core.local.entity.PopularMovieEntity;
import com.example.core.local.entity.UpcomingMovieEntity;
import com.example.core.remote.datasource.MovieDataSource;
import com.example.core.repos.home.paging.PlayingMoviesListRemoteMediator;
import com.example.core.repos.home.paging.PopularMoviesListRemoteMediator;
import com.example.core.repos.home.paging.UpcomingMoviesListRemoteMediator;
import com.example.core.repos.paging.utils.PagingDataWithSource;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/core/repos/home/MovieRepositoryImpl;", "Lcom/example/core/repos/home/MovieRepository;", "database", "Lcom/example/core/local/database/MovieDatabase;", "dataSource", "Lcom/example/core/remote/datasource/MovieDataSource;", "(Lcom/example/core/local/database/MovieDatabase;Lcom/example/core/remote/datasource/MovieDataSource;)V", "playingMovieDao", "Lcom/example/core/local/dao/PlayingMovieDao;", "popularMovieDao", "Lcom/example/core/local/dao/PopularMovieDao;", "upcomingMovieDao", "Lcom/example/core/local/dao/UpcomingMovieDao;", "getNowPlayingMovies", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/core/repos/paging/utils/PagingDataWithSource;", "Lcom/example/core/local/entity/PlayingMovieEntity;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getPopularMovies", "Lcom/example/core/local/entity/PopularMovieEntity;", "getUpComingMovies", "Lcom/example/core/local/entity/UpcomingMovieEntity;", "core_debug"})
public final class MovieRepositoryImpl implements com.example.core.repos.home.MovieRepository {
    private final com.example.core.local.database.MovieDatabase database = null;
    private final com.example.core.remote.datasource.MovieDataSource dataSource = null;
    private final com.example.core.local.dao.PopularMovieDao popularMovieDao = null;
    private final com.example.core.local.dao.UpcomingMovieDao upcomingMovieDao = null;
    private final com.example.core.local.dao.PlayingMovieDao playingMovieDao = null;
    
    public MovieRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.example.core.local.database.MovieDatabase database, @org.jetbrains.annotations.NotNull
    com.example.core.remote.datasource.MovieDataSource dataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<com.example.core.repos.paging.utils.PagingDataWithSource<com.example.core.local.entity.UpcomingMovieEntity>> getUpComingMovies(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope scope) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<com.example.core.repos.paging.utils.PagingDataWithSource<com.example.core.local.entity.PopularMovieEntity>> getPopularMovies(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope scope) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<com.example.core.repos.paging.utils.PagingDataWithSource<com.example.core.local.entity.PlayingMovieEntity>> getNowPlayingMovies(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope scope) {
        return null;
    }
}