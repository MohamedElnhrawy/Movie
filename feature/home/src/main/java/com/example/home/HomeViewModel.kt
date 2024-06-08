package com.example.home

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.map
import com.example.core.local.entity.PlayingMovieEntity
import com.example.core.local.entity.PopularMovieEntity
import com.example.core.local.entity.UpcomingMovieEntity
import com.example.core.repos.home.MovieType
import com.example.core.repos.paging.utils.PagingDataWithSource
import com.example.core.usecase.home.HomeUseCases
import com.example.home.component.model.HomeUI
import com.example.home.component.model.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val homeUseCases: HomeUseCases,
) : ViewModel() {

    var movieList: MutableStateFlow<PagingData<HomeUI>> =
        MutableStateFlow(value = PagingData.empty())

    var state: MutableState<HomeUIState> = mutableStateOf(HomeUIState())
        private set


    var selectedTabIndex: Int = 0


    private fun loadMovies(type: MovieType) {
//        viewModelScope.launch {
        with(viewModelScope) {
            val request = when (type) {
                MovieType.NOW_PLAYING -> homeUseCases.getNowPlayingMovieUseCase.invoke(this)
                MovieType.POPULAR -> homeUseCases.getPopularMovieUseCase.invoke(this)
                MovieType.UPCOMING -> homeUseCases.getUpcomingMovieUseCase.invoke(this)
            }
            request.onEach { pagingDataWithSource ->
                when (pagingDataWithSource) {
                    is PagingDataWithSource.Error -> {
                        state.value = HomeUIState(
                            error = pagingDataWithSource.throwable.localizedMessage
                                ?: pagingDataWithSource.throwable.message ?: ""
                        )
                    }

                    PagingDataWithSource.Loading -> {
                        state.value = HomeUIState(isLoading = true)
                    }

                    is PagingDataWithSource.Success -> {
//                        PagingDataWithSource(pagingDataWithSource.pagingData.map { it.toUI() }, pagingDataWithSource.source, pagingDataWithSource.totalCount)
//                        when(pagingDataWithSource.pagingData){
//
//                        }
                        movieList.value = transformToMovieEntity(type,pagingDataWithSource.pagingData)
                    }
                }
            }.launchIn(this)
        }
    }


    init {
        loadMovies(MovieType.NOW_PLAYING)
    }

    fun toggleTabs(type: MovieType) {
        selectedTabIndex = when (type) {
            MovieType.NOW_PLAYING -> 0
            MovieType.POPULAR -> 1
            MovieType.UPCOMING -> 2
        }
        loadMovies(type)
    }
    private fun transformToMovieEntity(type:MovieType, pagingDataWithSource: PagingData<Any>): PagingData<HomeUI> {
        val pagingData = pagingDataWithSource.map { entity ->
            when (type) {
                MovieType.NOW_PLAYING -> (entity as PlayingMovieEntity).toUI()
                MovieType.POPULAR -> (entity as PopularMovieEntity).toUI()
                MovieType.UPCOMING -> (entity as UpcomingMovieEntity).toUI()


            }
        }
//        return PagingDataWithSource(pagingData, pagingDataWithSource.source, pagingDataWithSource.totalCount)
        return pagingData
    }

}