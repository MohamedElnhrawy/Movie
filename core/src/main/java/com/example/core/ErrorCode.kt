package com.example.core

enum class ErrorCode(vararg val code: Long) {
    TOO_MANY_REQUESTS(9999L),
    UN_AUTHORIZED(403L),
    INVALID_PAGE(22L),
    NO_INTERNET(938465L),
    UNKNOWN,
    ;

    companion object {

        fun getErrorCode(code: Long) = values().firstOrNull { code in it.code } ?: UNKNOWN
    }
}
