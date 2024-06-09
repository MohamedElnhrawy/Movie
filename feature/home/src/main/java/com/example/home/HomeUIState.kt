package com.example.home


data class HomeUIState(
    var isLoading : Boolean = false,
    var error : String = "",
    var selectedTabIndex: Int = 0
)
