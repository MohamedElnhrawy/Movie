package com.example.core.di

import android.content.Context
import com.example.core.SingleEvent
import com.example.core.remote.datasource.MovieDataSource
import com.example.core.remote.interceptors.CacheInterceptor
import com.example.core.remote.interceptors.NetworkConnectionInterceptor
import com.example.core.remote.service.DetailApiService
import com.example.core.remote.service.HomeApiService
import com.example.core.utils.Constants.BASE_URL
import com.example.core.utils.getMoshiObject
import com.example.domain.BuildConfig
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.filterNot
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import java.io.File
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideMoshi(): Moshi = getMoshiObject()

    @Singleton
    @Provides
    fun provideMoshiConverterFactory(moshi: Moshi): Converter.Factory = MoshiConverterFactory.create(moshi)

    @Singleton
    @Provides
    fun provideTokenExpirationMutableFlow(): MutableStateFlow<SingleEvent<Long>> = MutableStateFlow(SingleEvent(-1L, -1))

    @Singleton
    @Provides
    fun provideTokenExpirationFlow(tokenExpirationFlow: MutableStateFlow<SingleEvent<Long>>): Flow<SingleEvent<Long>> =
        tokenExpirationFlow.filterNot { it.data == -1L }

    @Singleton
    @Provides
    fun provideCacheInterceptor() = CacheInterceptor()

    @Singleton
    @Provides
    fun provideNetworkInterceptor(@ApplicationContext context: Context) =
        NetworkConnectionInterceptor(context)

    @Singleton
    @Provides
    fun provideHttpLoggingInterceptor() =
        HttpLoggingInterceptor().also {
            it.level = HttpLoggingInterceptor.Level.BODY
        }

    @Singleton
    @Provides
    fun provideOkHttp(
        @ApplicationContext context: Context,
        cacheInterceptor: CacheInterceptor,
        loggingInterceptor: HttpLoggingInterceptor,
        internetConnectionInterceptor: NetworkConnectionInterceptor,
    ): OkHttpClient {
        return OkHttpClient.Builder().also {
            if (BuildConfig.DEBUG) {
                it.addInterceptor(loggingInterceptor)
            }
            it.addInterceptor(internetConnectionInterceptor)
            it.addNetworkInterceptor(cacheInterceptor)

        }
            .cache(Cache(File(context.cacheDir, "http-cache"), 10L * 1024L * 1024L))
            .build()
    }


    @Singleton
    @Provides
    fun provideDetailApiService(retrofit: Retrofit): DetailApiService =
        retrofit.create(DetailApiService::class.java)


    @Singleton
    @Provides
    fun provideApiService(retrofit: Retrofit): HomeApiService =
        retrofit.create(HomeApiService::class.java)

    @Singleton
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    @Singleton
    @Provides
    fun provideMovieDataSource(
        homeService: HomeApiService,
        moshi: Moshi,
        tokenExpirationFlow: MutableStateFlow<SingleEvent<Long>>,
    ) = MovieDataSource(homeService, moshi, tokenExpirationFlow)

}