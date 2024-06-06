package com.example.core.remote.interceptors;

import android.content.Context;
import android.net.ConnectivityManager;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/core/remote/interceptors/NetworkConnectionInterceptor;", "Lokhttp3/Interceptor;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "isConnected", "", "()Z", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "core_debug"})
public final class NetworkConnectionInterceptor implements okhttp3.Interceptor {
    private final android.content.Context mContext = null;
    
    public NetworkConnectionInterceptor(@org.jetbrains.annotations.NotNull
    android.content.Context mContext) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @java.lang.Override
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull
    okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        return null;
    }
    
    private final boolean isConnected() {
        return false;
    }
}