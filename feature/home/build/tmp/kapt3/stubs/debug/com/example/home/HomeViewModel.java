package com.example.home;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.ViewModel;
import androidx.paging.PagingData;
import com.example.core.local.entity.PlayingMovieEntity;
import com.example.core.local.entity.PopularMovieEntity;
import com.example.core.local.entity.UpcomingMovieEntity;
import com.example.core.repos.home.MovieType;
import com.example.core.repos.paging.utils.PagingDataWithSource;
import com.example.core.usecase.home.HomeUseCases;
import com.example.home.component.model.HomeUI;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ$\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006!"}, d2 = {"Lcom/example/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "homeUseCases", "Lcom/example/core/usecase/home/HomeUseCases;", "(Lcom/example/core/usecase/home/HomeUseCases;)V", "movieList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/paging/PagingData;", "Lcom/example/home/component/model/HomeUI;", "getMovieList", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "setMovieList", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "selectedTabIndex", "", "getSelectedTabIndex", "()I", "setSelectedTabIndex", "(I)V", "<set-?>", "Landroidx/compose/runtime/MutableState;", "Lcom/example/home/HomeUIState;", "state", "getState", "()Landroidx/compose/runtime/MutableState;", "loadMovies", "", "type", "Lcom/example/core/repos/home/MovieType;", "toggleTabs", "transformToMovieEntity", "pagingDataWithSource", "", "home_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.core.usecase.home.HomeUseCases homeUseCases = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<androidx.paging.PagingData<com.example.home.component.model.HomeUI>> movieList;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableState<com.example.home.HomeUIState> state;
    private int selectedTabIndex = 0;
    
    @javax.inject.Inject
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    com.example.core.usecase.home.HomeUseCases homeUseCases) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<androidx.paging.PagingData<com.example.home.component.model.HomeUI>> getMovieList() {
        return null;
    }
    
    public final void setMovieList(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.MutableStateFlow<androidx.paging.PagingData<com.example.home.component.model.HomeUI>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<com.example.home.HomeUIState> getState() {
        return null;
    }
    
    public final int getSelectedTabIndex() {
        return 0;
    }
    
    public final void setSelectedTabIndex(int p0) {
    }
    
    private final void loadMovies(com.example.core.repos.home.MovieType type) {
    }
    
    public final void toggleTabs(@org.jetbrains.annotations.NotNull
    com.example.core.repos.home.MovieType type) {
    }
    
    private final androidx.paging.PagingData<com.example.home.component.model.HomeUI> transformToMovieEntity(com.example.core.repos.home.MovieType type, androidx.paging.PagingData<java.lang.Object> pagingDataWithSource) {
        return null;
    }
}