package com.example.core.remote.service;

import com.example.core.remote.response.Response;
import com.example.core.remote.response.home.MovieResponse;
import com.example.core.utils.Constants;
import retrofit2.http.GET;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ/\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ/\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/example/core/remote/service/HomeApiService;", "", "getNowPlayingMovie", "Lcom/example/core/remote/response/home/MovieResponse;", "apiKey", "", "language", "page", "", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPopularMovie", "getUpComingMovie", "core_debug"})
public abstract interface HomeApiService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "movie/upcoming")
    public abstract java.lang.Object getUpComingMovie(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "language")
    java.lang.String language, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.core.remote.response.home.MovieResponse> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "movie/popular")
    public abstract java.lang.Object getPopularMovie(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "language")
    java.lang.String language, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.core.remote.response.home.MovieResponse> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "movie/now_playing")
    public abstract java.lang.Object getNowPlayingMovie(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "language")
    java.lang.String language, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.core.remote.response.home.MovieResponse> continuation);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
    }
}