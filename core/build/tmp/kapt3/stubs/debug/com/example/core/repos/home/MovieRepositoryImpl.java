package com.example.core.repos.home;

import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import com.example.core.remote.datasource.MovieDataSource;
import kotlinx.coroutines.flow.Flow;
import com.example.core.remote.response.home.Result;
import com.example.core.remote.service.HomeApiService;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/core/repos/home/MovieRepositoryImpl;", "Lcom/example/core/repos/home/MovieRepository;", "apiService", "Lcom/example/core/remote/service/HomeApiService;", "(Lcom/example/core/remote/service/HomeApiService;)V", "getNowPlayingMovies", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/example/core/remote/response/home/Result;", "getPopularMovies", "getUpComingMovies", "core_debug"})
public final class MovieRepositoryImpl implements com.example.core.repos.home.MovieRepository {
    private final com.example.core.remote.service.HomeApiService apiService = null;
    
    public MovieRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.example.core.remote.service.HomeApiService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.core.remote.response.home.Result>> getUpComingMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.core.remote.response.home.Result>> getPopularMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.core.remote.response.home.Result>> getNowPlayingMovies() {
        return null;
    }
}