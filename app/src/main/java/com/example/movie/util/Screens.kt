package com.example.movie.util

sealed class Screens(val route: String) {
    object SplashScreen : Screens(route = "splash_screen")
    object HomeScreen : Screens(route = "home_screen")
    object DetailScreen : Screens(route = "detail_screen")

}