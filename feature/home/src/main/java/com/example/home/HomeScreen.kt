package com.example.home

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.compose.collectAsLazyPagingItems


@Composable
fun HomeScreen(onNavigateDetailScreen : (String) -> Unit) {
    val viewModel: HomeViewModel = hiltViewModel()
    val pagingItems = viewModel.movieList.collectAsLazyPagingItems()
    val selectedTabIndex = viewModel.selectedTabIndex

    HomeContent( pagingItems = pagingItems, onNavigateDetailScreen = onNavigateDetailScreen,selectedTabIndex= selectedTabIndex,

    ) {
        viewModel.toggleTabs(it)
    }

}