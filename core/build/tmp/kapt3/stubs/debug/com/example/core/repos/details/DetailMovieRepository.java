package com.example.core.repos.details;

import com.example.detail.data.model.credit.Credit;
import com.example.detail.data.model.detail.MovieDetail;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/example/core/repos/details/DetailMovieRepository;", "", "getCredit", "Lcom/example/detail/data/model/credit/Credit;", "movieId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieDetail", "Lcom/example/detail/data/model/detail/MovieDetail;", "core_debug"})
public abstract interface DetailMovieRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCredit(int movieId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.detail.data.model.credit.Credit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMovieDetail(int movieId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.detail.data.model.detail.MovieDetail> continuation);
}