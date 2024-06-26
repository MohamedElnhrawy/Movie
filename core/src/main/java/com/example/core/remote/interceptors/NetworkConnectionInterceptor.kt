package com.example.core.remote.interceptors

import android.content.Context
import android.net.ConnectivityManager
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import java.io.IOException

class NetworkConnectionInterceptor(
       private val mContext: Context,
    ) : Interceptor {
        @Throws(IOException::class)
        override fun intercept(chain: Interceptor.Chain): Response {
            if (!isConnected) {
                throw NoConnectivityException("no internet connection")
            }
            val builder: Request.Builder = chain.request().newBuilder()
            return chain.proceed(builder.build())
        }

        private val isConnected: Boolean
            get() {
                val connectivityManager = mContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
                val netInfo = connectivityManager.activeNetworkInfo
                return netInfo != null && netInfo.isConnected
            }
    }
