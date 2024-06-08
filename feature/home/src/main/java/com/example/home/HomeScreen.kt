package com.example.home

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.compose.collectAsLazyPagingItems


@Composable
fun HomeScreen(onNavigateDetailScreen : (String) -> Unit) {
    val viewModel: HomeViewModel = hiltViewModel()
    val pagingItems = viewModel.movieList.collectAsLazyPagingItems()
    val state = viewModel.state.value
        HomeContent( pagingItems = pagingItems, onNavigateDetailScreen = onNavigateDetailScreen,
            selectedTabIndex = state.selectedTabIndex,
        error = state.error,
            isLoading = state.isLoading

    ) {
        viewModel.toggleTabs(it)
    }

}
