package com.example.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Snackbar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun ErrorPopup(
    errorMessage: String,
    durationMillis: Long = 3000, // Default duration of 3 seconds
) {
    val snackBarVisible = remember { mutableStateOf(true) }
    val coroutineScope = rememberCoroutineScope()

    LaunchedEffect(snackBarVisible.value) {
        if (snackBarVisible.value) {
            coroutineScope.launch {
                delay(durationMillis)
                snackBarVisible.value = false
            }
        }
    }

    Box() {
        if (snackBarVisible.value) {
            Snackbar(
                modifier = Modifier.align(Alignment.TopCenter).background(Color.Red),
                action = {},
            ) {
                Text(text = errorMessage)
            }
        }
    }
}