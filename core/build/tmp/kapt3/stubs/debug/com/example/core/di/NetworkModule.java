package com.example.core.di;

import android.content.Context;
import com.example.core.SingleEvent;
import com.example.core.remote.datasource.MovieDataSource;
import com.example.core.remote.interceptors.CacheInterceptor;
import com.example.core.remote.interceptors.NetworkConnectionInterceptor;
import com.example.core.remote.service.DetailApiService;
import com.example.core.remote.service.HomeApiService;
import com.example.domain.BuildConfig;
import com.squareup.moshi.Moshi;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import kotlinx.coroutines.flow.Flow;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.moshi.MoshiConverterFactory;
import java.io.File;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0007J,\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016H\u0007J\u0012\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010\u001b\u001a\u00020\u001cH\u0007J*\u0010\u001d\u001a\u00020\u001e2\b\b\u0001\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\u001aH\u0007J\u0010\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u001eH\u0007J(\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170%2\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016H\u0007J\u0014\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016H\u0007\u00a8\u0006\'"}, d2 = {"Lcom/example/core/di/NetworkModule;", "", "()V", "provideApiService", "Lcom/example/core/remote/service/HomeApiService;", "retrofit", "Lretrofit2/Retrofit;", "provideCacheInterceptor", "Lcom/example/core/remote/interceptors/CacheInterceptor;", "provideDetailApiService", "Lcom/example/core/remote/service/DetailApiService;", "provideHttpLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideMoshi", "Lcom/squareup/moshi/Moshi;", "provideMoshiConverterFactory", "Lretrofit2/Converter$Factory;", "moshi", "provideMovieDataSource", "Lcom/example/core/remote/datasource/MovieDataSource;", "homeService", "tokenExpirationFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/core/SingleEvent;", "", "provideNetworkInterceptor", "Lcom/example/core/remote/interceptors/NetworkConnectionInterceptor;", "context", "Landroid/content/Context;", "provideOkHttp", "Lokhttp3/OkHttpClient;", "cacheInterceptor", "loggingInterceptor", "internetConnectionInterceptor", "provideRetrofit", "okHttpClient", "provideTokenExpirationFlow", "Lkotlinx/coroutines/flow/Flow;", "provideTokenExpirationMutableFlow", "core_debug"})
@dagger.Module
public final class NetworkModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.core.di.NetworkModule INSTANCE = null;
    
    private NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.squareup.moshi.Moshi provideMoshi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final retrofit2.Converter.Factory provideMoshiConverterFactory(@org.jetbrains.annotations.NotNull
    com.squareup.moshi.Moshi moshi) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final kotlinx.coroutines.flow.MutableStateFlow<com.example.core.SingleEvent<java.lang.Long>> provideTokenExpirationMutableFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final kotlinx.coroutines.flow.Flow<com.example.core.SingleEvent<java.lang.Long>> provideTokenExpirationFlow(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.MutableStateFlow<com.example.core.SingleEvent<java.lang.Long>> tokenExpirationFlow) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.example.core.remote.interceptors.CacheInterceptor provideCacheInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.example.core.remote.interceptors.NetworkConnectionInterceptor provideNetworkInterceptor(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final okhttp3.logging.HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final okhttp3.OkHttpClient provideOkHttp(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.example.core.remote.interceptors.CacheInterceptor cacheInterceptor, @org.jetbrains.annotations.NotNull
    okhttp3.logging.HttpLoggingInterceptor loggingInterceptor, @org.jetbrains.annotations.NotNull
    com.example.core.remote.interceptors.NetworkConnectionInterceptor internetConnectionInterceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.example.core.remote.service.DetailApiService provideDetailApiService(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.example.core.remote.service.HomeApiService provideApiService(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.example.core.remote.datasource.MovieDataSource provideMovieDataSource(@org.jetbrains.annotations.NotNull
    com.example.core.remote.service.HomeApiService homeService, @org.jetbrains.annotations.NotNull
    com.squareup.moshi.Moshi moshi, @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.MutableStateFlow<com.example.core.SingleEvent<java.lang.Long>> tokenExpirationFlow) {
        return null;
    }
}