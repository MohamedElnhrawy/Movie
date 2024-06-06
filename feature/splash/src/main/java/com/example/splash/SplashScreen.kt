package com.example.splash

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    onNavigateHomeScreen: () -> Unit,
) {

    SplashContent()

    LaunchedEffect(key1 = true) {
        delay(2000)
        onNavigateHomeScreen()
    }
}