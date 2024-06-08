package com.example.core.remote

/**
 * A generic class that holds a value with its loading status.
 *
 * Result is usually created by the Repository classes where they return
 * `LiveData<Result<T>>`.
 */

sealed class Result<out T : Any> {
    data class Success<out T : Any>(val data: T) : Result<T>()

    data class Error(
        val errorCode: Long = CODE_UNKNOWN,
        val errorCause: Throwable? = null,
        val errorMessage: String? = null,
        val moreInfo: String? = null,
    ) : Result<Nothing>() {
        companion object {
            const val CODE_UNKNOWN = -1L
        }
    }

    object Loading : Result<Nothing>()

    companion object {
        fun <T : Any> success(data: T): Result<T> = Success(data)

        fun error(
            errorCause: Throwable? = null,
            errorMessage: String? = null,
            errorCode: Long = Error.CODE_UNKNOWN,
            moreInfo: String? = null,
        ): Error = Error(errorCode, errorCause, errorMessage, moreInfo)

        fun loading(): Result<Nothing> = Loading
    }
}

infix fun <T1 : Any, T2 : Any> Result<T1>.and(other: Result<T2>): Result<Pair<T1, T2>> =
    when {
        this is Result.Error || other is Result.Error -> (this as? Result.Error) ?: (other as? Result.Error) ?: Result.error()
        this is Result.Loading || other is Result.Loading -> Result.loading()
        else -> Result.success((this as Result.Success).data to (other as Result.Success).data)
    }

infix fun <T1 : Any, T2 : Any> Result<T1>.leftAnd(other: Result<T2>): Result<Pair<T1, Result<T2>>> =
    when {
        this is Result.Error -> this
        this is Result.Loading || other is Result.Loading -> Result.loading()
        else -> Result.success((this as Result.Success).data to other)
    }

infix fun <T1 : Any, T2 : Any> Result<T1>.rightAnd(other: Result<T2>): Result<Pair<Result<T1>, T2>> =
    when {
        other is Result.Error -> other
        this is Result.Loading || other is Result.Loading -> Result.loading()
        else -> Result.success(this to (other as Result.Success).data)
    }
