package com.example.home

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.paging.compose.LazyPagingItems
import com.example.core.model.ResultHomeUI
import com.example.core.repos.home.MovieType
import com.example.home.component.MoviesHorizontalPager
import com.example.home.component.TabBar

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun HomeContent(
    pagingItems: LazyPagingItems<ResultHomeUI>,
    onNavigateDetailScreen: (String) -> Unit,
    selectedTabIndex: Int,
    onTabSelected: (MovieType) -> Unit
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(start = 12.dp, end = 12.dp, top = 12.dp, bottom = 12.dp)
    ) {
        item {
            TabBar(selectedTabIndex, onTabSelected = onTabSelected)
        }
        item {
            Spacer(modifier = Modifier.height(25.dp))
        }
        item {
            MoviesHorizontalPager(
                pagingItems = pagingItems,
                onNavigateDetailScreen = onNavigateDetailScreen
            )
        }
    }
}


