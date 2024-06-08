package com.example.home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.util.lerp
import androidx.paging.LoadState
import androidx.paging.compose.LazyPagingItems
import coil.compose.AsyncImage
import com.example.component.ErrorDialog
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import com.example.core.model.ResultHomeUI
import com.example.home.component.model.HomeUI
import com.google.android.material.progressindicator.CircularProgressIndicator
import kotlin.math.absoluteValue

@OptIn(ExperimentalPagerApi::class)
@Composable
fun MoviesHorizontalPager(
    pagingItems: LazyPagingItems<HomeUI>,
    onNavigateDetailScreen: (String) -> Unit
) {
    val state = rememberPagerState(0)
    HorizontalPager(
        state = state,
        count = pagingItems.itemCount
    ) { page ->

        pagingItems.apply {
//            when {
//                loadState.refresh is LoadState.Loading -> {
//                    // Show loading indicator while initial data is being loaded
//                    CircularProgressIndicator(Modifier.padding(top = 10.dp))
//                }
//                loadState.append is LoadState.Loading -> {
//                    // Show loading indicator while additional data is being appended
//                    CircularProgressIndicator(Modifier.padding(top = 10.dp))
//                }
//               loadState.append is LoadState.Error -> {
//                    // Show error message for appending load error
//                    (pagingItems.loadState.append as LoadState.Error).error.localizedMessage?.let {
//                        ErrorDialog(
//                            errorMessage = it,
//                            onRetryClick = { retry() },
//                        )
//                    }
//                }
//                loadState.refresh is LoadState.Error -> {
//                    // Show error message for initial load error
//                    (pagingItems.loadState.refresh as LoadState.Error).error.localizedMessage?.let {
//                        ErrorDialog(
//                            errorMessage = it,
//                            onRetryClick = { retry() },
//                        )
//                    }
//                }
//                else -> {
                    val pageOffset = (state.currentPage - page) + state.currentPageOffset
                    val scaleFactor = 0.75f + (1f - 0.75f) * (1f - pageOffset.absoluteValue)
                    MovieItem(
                        movie = pagingItems[page]!!,
                        pageOffset = pageOffset,
                        scale = scaleFactor,
                        onNavigateDetailScreen = onNavigateDetailScreen
                    )
                }
//            }

//        }
        }

    }


@Composable
fun MovieItem(
    movie: HomeUI,
    pageOffset: Float,
    scale: Float,
    onNavigateDetailScreen: (String) -> Unit
) {
    val screenWidth = LocalConfiguration.current.screenWidthDp / 1.2
    val screenHeight = LocalConfiguration.current.screenHeightDp / 1.2

    Card(
        colors = CardDefaults.cardColors(Color.Transparent),
        shape = RoundedCornerShape(10.dp),
        onClick = {
            onNavigateDetailScreen(movie.id.toString())
        },
        elevation = CardDefaults.cardElevation(0.dp),
        modifier = Modifier
            .graphicsLayer {
                lerp(
                    start = 0.10f,
                    stop = 1f,
                    fraction = 1f - pageOffset.coerceIn(0f, 1f)
                )
                scaleY = scale
                scaleX = scale

                alpha = lerp(
                    start = 0.5f,
                    stop = 1f,
                    fraction = 1f - pageOffset.coerceIn(0f, 1f)
                )
            }
    ) {
        Box {
            AsyncImage(
                modifier = Modifier
                    .width(screenWidth.dp)
                    .height(screenHeight.dp)
                    .offset {
                        IntOffset(
                            x = (screenWidth.dp * pageOffset).roundToPx(),
                            y = 0,
                        )
                    },
                model = "https://image.tmdb.org/t/p/w500/${movie.posterPath}",
                contentDescription = "Image",
                contentScale = ContentScale.Crop
            )

            Box(modifier = Modifier
                .padding(12.dp)
                .align(Alignment.BottomCenter)
                .background(Color(0x4D000000)))
            {
                Text(
                    modifier = Modifier
                        .padding(12.dp),
                    text = movie.title,
                    fontSize = 16.sp,
                    color = MaterialTheme.colorScheme.onBackground,
                    fontWeight = FontWeight.SemiBold
                )
            }

        }

    }
}

