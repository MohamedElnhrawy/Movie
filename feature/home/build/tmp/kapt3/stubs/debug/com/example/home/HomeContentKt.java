package com.example.home;

import androidx.compose.animation.ExperimentalAnimationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier;
import androidx.paging.compose.LazyPagingItems;
import com.example.core.model.ResultHomeUI;
import com.example.core.repos.home.MovieType;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aF\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u00a8\u0006\f"}, d2 = {"HomeContent", "", "pagingItems", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/example/core/model/ResultHomeUI;", "onNavigateDetailScreen", "Lkotlin/Function1;", "", "selectedTabIndex", "", "onTabSelected", "Lcom/example/core/repos/home/MovieType;", "home_debug"})
public final class HomeContentKt {
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.animation.ExperimentalAnimationApi.class})
    public static final void HomeContent(@org.jetbrains.annotations.NotNull
    androidx.paging.compose.LazyPagingItems<com.example.core.model.ResultHomeUI> pagingItems, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onNavigateDetailScreen, int selectedTabIndex, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.core.repos.home.MovieType, kotlin.Unit> onTabSelected) {
    }
}