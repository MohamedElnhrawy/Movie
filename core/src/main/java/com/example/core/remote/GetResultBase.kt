package com.example.core.remote

import com.example.core.remote.interceptors.NoConnectivityException
import com.example.core.remote.interceptors.NoConnectivityException.Companion.NO_INTERNET_CONNECTION_ERROR_CODE
import com.example.core.remote.response.BaseErrorResponse
import com.example.core.remote.response.ErrorResponse
import com.squareup.moshi.Moshi
import retrofit2.HttpException
import retrofit2.Response

suspend fun <T : Any> getResult(
    moshi: Moshi,
    call: suspend () -> Response<T>,
): Result<T> {
    return try {
        val response = call()
        val body = response.body()
        if (body != null) Result.success(body) else HttpException(response).getErrorResult(moshi)
    } catch (noInternet: NoConnectivityException) {
        Result.error(noInternet, errorCode = NO_INTERNET_CONNECTION_ERROR_CODE)
    } catch (t: HttpException) {
        t.getErrorResult(moshi)
    } catch (expected: Throwable) {
        Result.error(expected)
    }
}

suspend fun getResultRaw(
    moshi: Moshi,
    call: suspend () -> Response<Map<String, Any>>,
    parseRawResponse: (Int, String?) -> Any?,
): Result<Any> {
    return try {
        val rawResponse = call()
        val code = rawResponse.code()
        val rawBody = rawResponse.body()?.toString()
        val body = parseRawResponse(code, rawBody)
        if (body != null) Result.success(body) else HttpException(rawResponse).getErrorResult(moshi)
    } catch (noInternet: NoConnectivityException) {
        Result.error(noInternet, errorCode = NO_INTERNET_CONNECTION_ERROR_CODE)
    } catch (t: HttpException) {
        t.getErrorResult(moshi)
    } catch (expected: Throwable) {
        Result.error(expected)
    }
}

private fun HttpException.getErrorResult(moshi: Moshi): Result.Error =
    try {
        this.response()?.errorBody()?.string()?.let {
            moshi.adapter(BaseErrorResponse::class.java).lenient().fromJson(it)?.error
                ?: moshi.adapter(ErrorResponse::class.java).lenient().fromJson(it)
        }?.let {
            Result.error(
                errorCode = it.code?.toLongOrNull() ?: Result.Error.CODE_UNKNOWN,
                errorMessage = it.description ?: it.message,
                moreInfo = it.MoreInfo?.date ?: it.MoreInfo?.maxAmount?.toString(),
            )
        } ?: Result.error(errorCode = code().toLong(), errorCause = this)
    } catch (expected: Throwable) {
        Result.error(errorCode = code().toLong(), errorCause = expected)
    }
