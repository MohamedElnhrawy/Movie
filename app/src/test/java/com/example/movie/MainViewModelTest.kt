package com.example.movie

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.core.SingleEvent
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.ArgumentMatchers.any
import org.mockito.Mock
import org.mockito.Mockito.doAnswer
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MainViewModelTest {

    @get:Rule
    val rule = InstantTaskExecutorRule()

    @Mock
    lateinit var tokenExpirationFlow: Flow<SingleEvent<Long>>

    @Mock
    lateinit var viewModelScope: CoroutineScope

    @Before
    fun setUp() {
        // Initialize mocks and dependencies
        MockitoAnnotations.initMocks(this)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `test token expiration flow`() {
        runBlockingTest {
            // Create test data
            val testData = flowOf(SingleEvent(100L))

            // Stub the tokenExpirationFlow to return test data
            doAnswer { invocation ->
                val action: suspend (SingleEvent<Long>) -> Unit = invocation.getArgument(0)

                // Execute the action for each item in the flow within a coroutine scope
                launch {
                    testData.collect { event ->
                        action.invoke(event)
                    }
                }
            }.`when`(tokenExpirationFlow).onEach(any())

            // Create MainViewModel instance with mocked dependencies
            val viewModel = MainViewModel(tokenExpirationFlow)

            // Capture emitted values
            val capturedValues = mutableListOf<Long>()
            viewModel.tokenExpirationFlow.collect {
                capturedValues.add(it.getContentIfNotHandled() ?: -1)
            }

            // Verify the emitted values
            assertEquals(listOf(100L), capturedValues)
        }
    }
}