package com.example.core.remote.datasource;

import com.example.core.SingleEvent;
import com.example.core.remote.service.HomeApiService;
import com.squareup.moshi.Moshi;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/example/core/remote/datasource/MovieDataSource;", "Lcom/example/core/remote/datasource/BaseDataSource;", "apiService", "Lcom/example/core/remote/service/HomeApiService;", "moshi", "Lcom/squareup/moshi/Moshi;", "tokenExpirationFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/core/SingleEvent;", "", "(Lcom/example/core/remote/service/HomeApiService;Lcom/squareup/moshi/Moshi;Lkotlinx/coroutines/flow/MutableStateFlow;)V", "getNowPlayingMovie", "Lcom/example/core/remote/Result;", "Lcom/example/core/remote/response/home/MoviesResponse;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPopularMovie", "getUpComingMovie", "core_debug"})
public final class MovieDataSource extends com.example.core.remote.datasource.BaseDataSource {
    private final com.example.core.remote.service.HomeApiService apiService = null;
    
    public MovieDataSource(@org.jetbrains.annotations.NotNull
    com.example.core.remote.service.HomeApiService apiService, @org.jetbrains.annotations.NotNull
    com.squareup.moshi.Moshi moshi, @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.MutableStateFlow<com.example.core.SingleEvent<java.lang.Long>> tokenExpirationFlow) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getUpComingMovie(int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.core.remote.Result<com.example.core.remote.response.home.MoviesResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getPopularMovie(int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.core.remote.Result<com.example.core.remote.response.home.MoviesResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getNowPlayingMovie(int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.core.remote.Result<com.example.core.remote.response.home.MoviesResponse>> continuation) {
        return null;
    }
}