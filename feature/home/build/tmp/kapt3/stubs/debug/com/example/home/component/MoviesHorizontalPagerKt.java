package com.example.home.component;

import androidx.compose.material3.CardDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.font.FontWeight;
import androidx.paging.compose.LazyPagingItems;
import com.google.accompanist.pager.ExperimentalPagerApi;
import com.example.core.model.ResultHomeUI;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0007\u001a*\u0010\n\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0007\u00a8\u0006\r"}, d2 = {"MovieItem", "", "movie", "Lcom/example/core/model/ResultHomeUI;", "pageOffset", "", "scale", "onNavigateDetailScreen", "Lkotlin/Function1;", "", "MoviesHorizontalPager", "pagingItems", "Landroidx/paging/compose/LazyPagingItems;", "home_debug"})
public final class MoviesHorizontalPagerKt {
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {com.google.accompanist.pager.ExperimentalPagerApi.class})
    public static final void MoviesHorizontalPager(@org.jetbrains.annotations.NotNull
    androidx.paging.compose.LazyPagingItems<com.example.core.model.ResultHomeUI> pagingItems, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onNavigateDetailScreen) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void MovieItem(@org.jetbrains.annotations.NotNull
    com.example.core.model.ResultHomeUI movie, float pageOffset, float scale, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onNavigateDetailScreen) {
    }
}