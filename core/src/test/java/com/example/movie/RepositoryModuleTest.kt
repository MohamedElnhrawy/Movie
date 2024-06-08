package com.example.movie

import com.example.core.di.RepositoryModule
import com.example.core.local.database.MovieDatabase
import com.example.core.remote.datasource.MovieDataSource
import com.example.core.remote.service.DetailApiService
import junit.framework.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class RepositoryModuleTest {

    @Mock
    lateinit var mockDataSource: MovieDataSource

    @Mock
    lateinit var mockMovieDatabase: MovieDatabase

    @Mock
    lateinit var mockDetailApiService: DetailApiService

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun `test provideMovieRepository`() {
        // Create an instance of RepositoryModule
        val repositoryModule = RepositoryModule

        // Call the provideMovieRepository method with the mocked dependencies
        val movieRepository = repositoryModule.provideMovieRepository(mockDataSource, mockMovieDatabase)

        // Verify that the returned MovieRepository instance is not null
        assertNotNull(movieRepository)

        // Add additional assertions if necessary
    }

    @Test
    fun `test provideDetailMovieRepository`() {
        // Create an instance of RepositoryModule
        val repositoryModule = RepositoryModule

        // Call the provideDetailMovieRepository method with the mocked DetailApiService
        val detailMovieRepository = repositoryModule.provideDetailMovieRepository(mockDetailApiService)

        // Verify that the returned DetailMovieRepository instance is not null
        assertNotNull(detailMovieRepository)

    }

}