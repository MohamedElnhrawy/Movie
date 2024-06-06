package com.example.core.usecase.details;

import com.example.core.remote.response.Response;
import com.example.core.repos.details.DetailMovieRepository;
import retrofit2.HttpException;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/example/core/usecase/details/GetMovieDetailUseCase;", "", "detailMovieRepository", "Lcom/example/core/repos/details/DetailMovieRepository;", "(Lcom/example/core/repos/details/DetailMovieRepository;)V", "getDetailMovieRepository", "()Lcom/example/core/repos/details/DetailMovieRepository;", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/core/remote/response/Response;", "Lcom/example/core/model/MovieDetailUI;", "movieId", "", "core_debug"})
public final class GetMovieDetailUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.example.core.repos.details.DetailMovieRepository detailMovieRepository = null;
    
    public GetMovieDetailUseCase(@org.jetbrains.annotations.NotNull
    com.example.core.repos.details.DetailMovieRepository detailMovieRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.core.repos.details.DetailMovieRepository getDetailMovieRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.example.core.remote.response.Response<com.example.core.model.MovieDetailUI>> invoke(int movieId) {
        return null;
    }
}