package com.example.detail;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.example.core.model.CastUI;
import com.example.core.remote.response.Response;
import com.example.core.usecase.details.DetailUseCases;
import com.example.core.utils.Constants;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R6\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\b@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/detail/DetailViewModel;", "Landroidx/lifecycle/ViewModel;", "useCases", "Lcom/example/core/usecase/details/DetailUseCases;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/example/core/usecase/details/DetailUseCases;Landroidx/lifecycle/SavedStateHandle;)V", "<set-?>", "Landroidx/compose/runtime/MutableState;", "", "Lcom/example/core/model/CastUI;", "creditList", "getCreditList", "()Landroidx/compose/runtime/MutableState;", "Lcom/example/detail/DetailUIState;", "state", "getState", "loadCast", "", "movieId", "", "loadMovie", "detail_debug"})
public final class DetailViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.core.usecase.details.DetailUseCases useCases = null;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableState<com.example.detail.DetailUIState> state;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableState<java.util.List<com.example.core.model.CastUI>> creditList;
    
    @javax.inject.Inject
    public DetailViewModel(@org.jetbrains.annotations.NotNull
    com.example.core.usecase.details.DetailUseCases useCases, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<com.example.detail.DetailUIState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.util.List<com.example.core.model.CastUI>> getCreditList() {
        return null;
    }
    
    private final void loadMovie(int movieId) {
    }
    
    private final void loadCast(int movieId) {
    }
}