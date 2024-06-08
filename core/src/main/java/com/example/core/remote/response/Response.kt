package com.example.core.remote.response

sealed class Response <out T> {
    data class Success<out T>(val data : T) : Response<T>()
    data class Error(val errorMessage : String) : Response<Nothing>()
    object Loading : Response<Nothing>()
}