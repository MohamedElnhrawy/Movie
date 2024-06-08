package com.example.movie

import com.example.core.di.UseCaseModule
import com.example.core.repos.details.DetailMovieRepository
import com.example.core.repos.home.MovieRepository
import junit.framework.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class UseCaseModuleTest {

    @Mock
    lateinit var mockMovieRepository: MovieRepository

    @Mock
    lateinit var mockDetailMovieRepository: DetailMovieRepository

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun `test provideHomeUseCases`() {
        // Create an instance of UseCaseModule
        val useCaseModule = UseCaseModule

        // Call the provideHomeUseCases method with the mocked MovieRepository
        val homeUseCases = useCaseModule.provideHomeUseCases(mockMovieRepository)

        // Verify that the returned HomeUseCases instance is not null
        assertNotNull(homeUseCases)

        // Add additional assertions if necessary
    }

    @Test
    fun `test provideDetailUseCases`() {
        // Create an instance of UseCaseModule
        val useCaseModule = UseCaseModule

        // Call the provideDetailUseCases method with the mocked DetailMovieRepository
        val detailUseCases = useCaseModule.provideDetailUseCases(mockDetailMovieRepository)

        // Verify that the returned DetailUseCases instance is not null
        assertNotNull(detailUseCases)

    }

}