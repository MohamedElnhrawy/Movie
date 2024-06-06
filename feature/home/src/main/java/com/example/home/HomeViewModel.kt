package com.example.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import androidx.paging.map
import com.example.core.mappers.toResultHomeUI
import com.example.core.model.ResultHomeUI
import com.example.core.repos.home.MovieType
import com.example.core.usecase.home.HomeUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val homeUseCases: HomeUseCases,
) : ViewModel() {

    var movieList: MutableStateFlow<PagingData<ResultHomeUI>> =
        MutableStateFlow(value = PagingData.empty())
        private set


    var selectedTabIndex: Int = 0


    private fun loadNowPlayingMovie() {
        homeUseCases.getNowPlayingMovieUseCase.invoke().cachedIn(viewModelScope)
            .onEach {
                movieList.value = it.map { result -> result.toResultHomeUI() }
            }
            .launchIn(viewModelScope)
    }


    private fun loadUpcomingMovie() {
        homeUseCases.getUpcomingMovieUseCase.invoke().cachedIn(viewModelScope)
            .onEach {
                movieList.value = it.map { result -> result.toResultHomeUI() }
            }
            .launchIn(viewModelScope)
    }



    private fun loadPopularMovie() {

        homeUseCases.getPopularMovieUseCase.invoke().cachedIn(viewModelScope)
            .onEach {
                movieList.value = it.map { result -> result.toResultHomeUI() }
            }
            .launchIn(viewModelScope)

    }

    init {
        loadNowPlayingMovie()
    }

    fun toggleTabs(type:MovieType){
        selectedTabIndex = when(type){
             MovieType.NOW_PLAYING -> 0
             MovieType.POPULAR -> 1
             MovieType.UPCOMING -> 2
        }
        when(type){
            MovieType.NOW_PLAYING -> loadNowPlayingMovie()
            MovieType.POPULAR -> loadPopularMovie()
            MovieType.UPCOMING -> loadUpcomingMovie()
        }
    }
}