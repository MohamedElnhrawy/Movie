package com.example.movie.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.core.utils.Constants.MOVIE_ID
import com.example.detail.DetailScreen
import com.example.home.HomeScreen
import com.example.movie.util.Screens
import com.example.splash.SplashScreen

fun NavGraphBuilder.homeScreen(navController: NavController) {
    composable(Screens.HomeScreen.route) {
        HomeScreen(
            onNavigateDetailScreen = { id ->
                navController.navigate(Screens.DetailScreen.route + "/${id}")
            }
        )
    }
}

fun NavGraphBuilder.detailScreen(navController: NavController) {
    composable(route = Screens.DetailScreen.route + "/{${MOVIE_ID}}") {
        DetailScreen(
            onNavigateHome = {
                navController.popBackStack()
            }
        )
    }
}

fun NavGraphBuilder.splashScreen(navController: NavController) {

    composable(route = Screens.SplashScreen.route) {
        SplashScreen(
            onNavigateHomeScreen = {
                navController.popBackStack()
                navController.navigate(Screens.HomeScreen.route)
            },
        )
    }
}

