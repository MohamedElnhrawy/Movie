package com.example.core.remote.service;

import com.example.core.utils.Constants;
import com.example.detail.data.model.credit.Credit;
import com.example.detail.data.model.detail.MovieDetail;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ/\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/example/core/remote/service/DetailApiService;", "", "getCredit", "Lcom/example/detail/data/model/credit/Credit;", "movieId", "", "apiKey", "", "language", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieDetail", "Lcom/example/detail/data/model/detail/MovieDetail;", "core_debug"})
public abstract interface DetailApiService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "movie/{movie_id}")
    public abstract java.lang.Object getMovieDetail(@retrofit2.http.Path(value = "movie_id")
    int movieId, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "language")
    java.lang.String language, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.detail.data.model.detail.MovieDetail> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "movie/{movie_id}/credits")
    public abstract java.lang.Object getCredit(@retrofit2.http.Path(value = "movie_id")
    int movieId, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "language")
    java.lang.String language, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.detail.data.model.credit.Credit> continuation);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
    }
}