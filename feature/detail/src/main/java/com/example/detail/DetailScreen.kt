package com.example.detail


import androidx.compose.runtime.Composable

import androidx.hilt.navigation.compose.hiltViewModel
import com.kursatkumsuz.messagebar.MessageBarContent
import com.kursatkumsuz.messagebar.rememberAnimatedBarState

@Composable
fun DetailScreen(onNavigateHome: () -> Unit) {
    val viewModel: DetailViewModel = hiltViewModel()
    val barState = rememberAnimatedBarState()
    val state = viewModel.state.value
    val castList = viewModel.creditList.value
    MessageBarContent(barState = barState, duration = 800L) {
        DetailContent(
            movie = state.movie,
            isLoading = state.isLoading,
            errorMessage = state.error,
            cast = castList,
            onBackClick = onNavigateHome
        )
    }
}