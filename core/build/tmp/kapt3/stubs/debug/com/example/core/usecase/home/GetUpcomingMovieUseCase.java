package com.example.core.usecase.home;

import com.example.core.local.entity.UpcomingMovieEntity;
import com.example.core.repos.home.MovieRepository;
import com.example.core.repos.paging.utils.PagingDataWithSource;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/core/usecase/home/GetUpcomingMovieUseCase;", "", "movieRepository", "Lcom/example/core/repos/home/MovieRepository;", "(Lcom/example/core/repos/home/MovieRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/core/repos/paging/utils/PagingDataWithSource;", "Lcom/example/core/local/entity/UpcomingMovieEntity;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "core_debug"})
public final class GetUpcomingMovieUseCase {
    private final com.example.core.repos.home.MovieRepository movieRepository = null;
    
    public GetUpcomingMovieUseCase(@org.jetbrains.annotations.NotNull
    com.example.core.repos.home.MovieRepository movieRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.example.core.repos.paging.utils.PagingDataWithSource<com.example.core.local.entity.UpcomingMovieEntity>> invoke(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope scope) {
        return null;
    }
}