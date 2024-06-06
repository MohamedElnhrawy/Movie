package com.example.home;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.paging.PagingData;
import com.example.core.model.ResultHomeUI;
import com.example.core.repos.home.MovieType;
import com.example.core.usecase.home.HomeUseCases;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R6\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0019"}, d2 = {"Lcom/example/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "homeUseCases", "Lcom/example/core/usecase/home/HomeUseCases;", "(Lcom/example/core/usecase/home/HomeUseCases;)V", "<set-?>", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/paging/PagingData;", "Lcom/example/core/model/ResultHomeUI;", "movieList", "getMovieList", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "selectedTabIndex", "", "getSelectedTabIndex", "()I", "setSelectedTabIndex", "(I)V", "loadNowPlayingMovie", "", "loadPopularMovie", "loadUpcomingMovie", "toggleTabs", "type", "Lcom/example/core/repos/home/MovieType;", "home_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.core.usecase.home.HomeUseCases homeUseCases = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<androidx.paging.PagingData<com.example.core.model.ResultHomeUI>> movieList;
    private int selectedTabIndex = 0;
    
    @javax.inject.Inject
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    com.example.core.usecase.home.HomeUseCases homeUseCases) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<androidx.paging.PagingData<com.example.core.model.ResultHomeUI>> getMovieList() {
        return null;
    }
    
    public final int getSelectedTabIndex() {
        return 0;
    }
    
    public final void setSelectedTabIndex(int p0) {
    }
    
    private final void loadNowPlayingMovie() {
    }
    
    private final void loadUpcomingMovie() {
    }
    
    private final void loadPopularMovie() {
    }
    
    public final void toggleTabs(@org.jetbrains.annotations.NotNull
    com.example.core.repos.home.MovieType type) {
    }
}