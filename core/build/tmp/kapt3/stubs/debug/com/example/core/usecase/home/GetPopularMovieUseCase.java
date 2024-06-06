package com.example.core.usecase.home;

import androidx.paging.PagingData;
import com.example.core.repos.home.MovieRepository;
import com.example.core.remote.response.home.Result;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/core/usecase/home/GetPopularMovieUseCase;", "", "movieRepository", "Lcom/example/core/repos/home/MovieRepository;", "(Lcom/example/core/repos/home/MovieRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/example/core/remote/response/home/Result;", "core_debug"})
public final class GetPopularMovieUseCase {
    private final com.example.core.repos.home.MovieRepository movieRepository = null;
    
    public GetPopularMovieUseCase(@org.jetbrains.annotations.NotNull
    com.example.core.repos.home.MovieRepository movieRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.core.remote.response.home.Result>> invoke() {
        return null;
    }
}