package com.example.core.usecase.details;

import com.example.core.remote.response.Response;
import com.example.core.repos.details.DetailMovieRepository;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J#\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\b2\u0006\u0010\f\u001a\u00020\rH\u0086\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/example/core/usecase/details/GetCastUseCase;", "", "detailMovieRepository", "Lcom/example/core/repos/details/DetailMovieRepository;", "(Lcom/example/core/repos/details/DetailMovieRepository;)V", "getDetailMovieRepository", "()Lcom/example/core/repos/details/DetailMovieRepository;", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/core/remote/response/Response;", "", "Lcom/example/core/model/CastUI;", "movieId", "", "core_debug"})
public final class GetCastUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.example.core.repos.details.DetailMovieRepository detailMovieRepository = null;
    
    public GetCastUseCase(@org.jetbrains.annotations.NotNull
    com.example.core.repos.details.DetailMovieRepository detailMovieRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.core.repos.details.DetailMovieRepository getDetailMovieRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.example.core.remote.response.Response<java.util.List<com.example.core.model.CastUI>>> invoke(int movieId) {
        return null;
    }
}