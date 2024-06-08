package com.example.detail

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core.model.CastUI
import com.example.core.remote.response.Response
import com.example.core.usecase.details.DetailUseCases
import com.example.core.utils.Constants
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(
    private val useCases: DetailUseCases,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    var state: MutableState<DetailUIState> = mutableStateOf(DetailUIState())
        private set

    var creditList: MutableState<List<CastUI>> = mutableStateOf(listOf())
        private set

    init {
        savedStateHandle.get<String>(Constants.MOVIE_ID)?.let {
            loadMovie(movieId = it.toInt())
            loadCast(movieId = it.toInt())
            println("MOVIE ID $it")
        }
    }

    private fun loadMovie(movieId: Int) {
        useCases.getMovieDetailUseCase.invoke(movieId = movieId).onEach { response ->
            when (response) {
                is Response.Success -> {
                    state.value = DetailUIState(movie = response.data)
                    println("Movie ${response.data}")
                }

                is Response.Loading -> {
                    state.value = DetailUIState(isLoading = true)
                }

                is Response.Error -> {
                    state.value = DetailUIState(error = response.errorMessage)
                }
            }

        }.launchIn(viewModelScope)
    }

    private fun loadCast(movieId: Int) {
        useCases.getCastUseCase.invoke(movieId = movieId).onEach { response ->
            when (response) {
                is Response.Success -> {
                    val cast = response.data
                    creditList.value = cast
                }

                else -> {}
            }
        }.launchIn(viewModelScope)
    }


}