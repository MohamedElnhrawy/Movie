package com.example.core.di

import android.content.Context
import com.example.core.remote.interceptors.CacheInterceptor
import com.example.core.remote.interceptors.NetworkConnectionInterceptor
import com.example.core.remote.service.DetailApiService
import com.example.core.remote.service.HomeApiService
import com.example.core.utils.Constants.BASE_URL
import com.example.domain.BuildConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {


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


}