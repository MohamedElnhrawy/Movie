package com.example.movie

import android.content.Context
import com.example.core.di.NetworkModule
import junit.framework.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class NetworkModuleTest {

    @Mock
    lateinit var mockContext: Context

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun `test provideMoshi`() {
        // Create an instance of NetworkModule
        val networkModule = NetworkModule

        // Call the provideMoshi method
        val moshi = networkModule.provideMoshi()

        // Verify that the returned Moshi instance is not null
        assertNotNull(moshi)

    }

}