package com.example.home

import androidx.paging.PagingData
import com.example.home.component.model.HomeUI
import kotlinx.coroutines.flow.MutableStateFlow

data class HomeUIState(
    var movies : MutableStateFlow<PagingData<HomeUI>> =  MutableStateFlow(value = PagingData.empty()),
    var isLoading : Boolean = false,
    var error : String = ""
)
