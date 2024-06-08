package com.example.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core.SingleEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(open val tokenExpirationFlow: Flow<SingleEvent<Long>>,
) : ViewModel(){

    init {
        tokenExpirationFlow.onEach {
            if (it.isHandled.not()) {
            }
            it.isHandled = true
        }.launchIn(viewModelScope)
    }
}