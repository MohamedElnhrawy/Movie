package com.example.core.remote.datasource


import com.example.core.SingleEvent
import com.squareup.moshi.Moshi
import kotlinx.coroutines.flow.MutableStateFlow
import retrofit2.HttpException
import retrofit2.Response
import com.example.core.remote.getResult
import com.example.core.ErrorCode
import com.example.core.remote.Result
import com.example.core.remote.getResultRaw
import com.example.core.remote.interceptors.NoConnectivityException

abstract class BaseDataSource(
    private val moshi: Moshi,
    private val tokenExpirationFlow: MutableStateFlow<SingleEvent<Long>>,
) {
    suspend fun <T : Any> getResult(call: suspend () -> Response<T>): Result<T> = checkAndEmitTokenExpiration(getResult(moshi, call))

    suspend fun getResultRaw(
        call: suspend () -> Response<Map<String, Any>>,
        parseRawResponse: (Int, String?) -> Any?,
    ): Result<Any> = checkAndEmitTokenExpiration(getResultRaw(moshi, call, parseRawResponse))

    private fun <T : Any> checkAndEmitTokenExpiration(result: Result<T>): Result<T> {
        if (result is Result.Error) {
            when {
                result.errorCode == AUTH_ERROR_CODE || result.errorCause is HttpException && result.errorCause.code() == AUTH_ERROR_CODE.toInt() -> {
                    val sourceId = result.errorCode.toInt()
                    tokenExpirationFlow.value = SingleEvent(AUTH_ERROR_CODE, sourceId)
                }
                result.errorCause is NoConnectivityException -> {
                    val sourceId = result.errorCode.toInt()
                    tokenExpirationFlow.value = SingleEvent(ErrorCode.NO_INTERNET.code.first(), sourceId)
                }

                result.errorCause != null && result.errorCause.isTooManyRequestsException() -> {
                    val sourceId = result.errorCode.toInt()
                    tokenExpirationFlow.value = SingleEvent(ErrorCode.TOO_MANY_REQUESTS.code.first(), sourceId)
                }
            }
        }

        return result
    }

    private fun Throwable.isTooManyRequestsException(): Boolean =
        (message != null && message!!.contains("Too many follow-up requests", ignoreCase = true)) ||
            (cause != null && cause!!.isTooManyRequestsException())

    companion object {
        const val AUTH_ERROR_CODE = 401L
    }
}
