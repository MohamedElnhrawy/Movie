package com.example.movie

import android.app.Application
import androidx.room.RoomDatabase
import com.example.core.di.DatabaseModule
import com.example.core.local.database.DatabaseWrapper
import com.example.core.local.database.MovieDatabase
import com.example.domain.BuildConfig
import junit.framework.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.ArgumentMatchers.eq
import org.mockito.Mock
import org.mockito.Mockito.times
import org.mockito.Mockito.verify
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner
import javax.inject.Inject

@RunWith(MockitoJUnitRunner::class)
class DatabaseModuleTest {

    @Mock
    lateinit var application: Application

    @Mock
    lateinit var mockBuilder: RoomDatabase.Builder<MovieDatabase>

    @Mock
    lateinit var mockDatabase: MovieDatabase

    @Inject
    lateinit var databaseWrapper: DatabaseWrapper // Inject DatabaseWrapper

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        // Initialize Hilt
//        DaggerDatabaseWrapperModuleComponent.create().inject(this)
    }

    @Test
    fun testProvideMovieDatabase() {
        // Mock the behavior of the wrapper class
        `when`(databaseWrapper.databaseBuilder(application, MovieDatabase::class.java, BuildConfig.DATABASE_NAME))
            .thenReturn(mockBuilder)
        `when`(mockBuilder.build()).thenReturn(mockDatabase)

        // Create DatabaseModule instance
        val databaseModule = DatabaseModule

        // Call the provideMovieDatabase method with the mocked application and injected DatabaseWrapper
        val resultDatabase = databaseModule.provideMovieDatabase(application, databaseWrapper)

        // Verify that the returned database is not null
        assertNotNull(resultDatabase)

        // Verify that the wrapper method was called with the correct arguments
        verify(databaseWrapper, times(1)).databaseBuilder(
            eq(application),
            eq(MovieDatabase::class.java),
            eq(BuildConfig.DATABASE_NAME)
        )

        // Verify that build() was called on the database builder
        verify(mockBuilder, times(1)).build()
    }

}