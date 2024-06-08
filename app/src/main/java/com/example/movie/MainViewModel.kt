package com.example.movie

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core.SingleEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(tokenExpirationFlow: Flow<SingleEvent<Long>>,
) : ViewModel(){

    init {
        tokenExpirationFlow.onEach {
            if (it.isHandled.not()) {
//                applyAction(MainActivityAction.TokenExpired(it.data))
                Log.e("asdsadsad","asdasdsad")
            }
            it.isHandled = true
        }.launchIn(viewModelScope)
    }
}