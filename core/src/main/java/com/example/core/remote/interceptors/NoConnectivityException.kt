package com.example.core.remote.interceptors

import java.io.IOException

class NoConnectivityException : IOException {
    constructor(message: String) : super(message)
    constructor(message: String, cause: Throwable) : super(message, cause)
    constructor(cause: Throwable) : super(cause)

    companion object {
        const val NO_INTERNET_CONNECTION_ERROR_CODE = 938465L
    }
}
