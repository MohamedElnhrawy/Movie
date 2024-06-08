package com.example.movie

import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.flow.MutableStateFlow

class TestFlowCollector<T>(private val testData: MutableStateFlow<T>) : FlowCollector<T> {
    override suspend fun emit(value: T) {
        // Add the emitted value to the test data
        testData.value = value
    }
}