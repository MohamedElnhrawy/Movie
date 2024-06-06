package com.example.home.component


import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import com.example.core.repos.home.MovieType
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab

@ExperimentalAnimationApi
@Composable
fun TabBar(selectedTab: Int, onTabSelected: (MovieType) -> Unit) {
    var tabIndex by remember { mutableIntStateOf(selectedTab) }

    val tabs = listOf(
        TabBarItem("Now Playing",MovieType.NOW_PLAYING),
        TabBarItem("Upcoming",MovieType.UPCOMING),
        TabBarItem("Popular",MovieType.POPULAR),
    )

    Column(modifier = Modifier.fillMaxWidth()) {
        ScrollableTabRow(selectedTabIndex = tabIndex) {
            tabs.forEachIndexed { index, item ->
                Tab(text = { Text(item.name) },
                    selected = tabIndex == index,
                    onClick = {
                        tabIndex = index
                        onTabSelected(item.type)
                              },
                )
            }
        }

    }
}