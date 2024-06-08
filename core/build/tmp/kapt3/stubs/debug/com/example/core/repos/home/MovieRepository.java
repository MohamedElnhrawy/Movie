package com.example.core.repos.home;

import com.example.core.local.entity.PlayingMovieEntity;
import com.example.core.local.entity.PopularMovieEntity;
import com.example.core.local.entity.UpcomingMovieEntity;
import kotlinx.coroutines.flow.Flow;
import com.example.core.repos.paging.utils.PagingDataWithSource;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\f"}, d2 = {"Lcom/example/core/repos/home/MovieRepository;", "", "getNowPlayingMovies", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/core/repos/paging/utils/PagingDataWithSource;", "Lcom/example/core/local/entity/PlayingMovieEntity;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getPopularMovies", "Lcom/example/core/local/entity/PopularMovieEntity;", "getUpComingMovies", "Lcom/example/core/local/entity/UpcomingMovieEntity;", "core_debug"})
public abstract interface MovieRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.example.core.repos.paging.utils.PagingDataWithSource<com.example.core.local.entity.UpcomingMovieEntity>> getUpComingMovies(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope scope);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.example.core.repos.paging.utils.PagingDataWithSource<com.example.core.local.entity.PopularMovieEntity>> getPopularMovies(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope scope);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.example.core.repos.paging.utils.PagingDataWithSource<com.example.core.local.entity.PlayingMovieEntity>> getNowPlayingMovies(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope scope);
}