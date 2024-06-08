package com.example.core.repos.paging.utils

data class PagingException(
    val errorCode: Long = -1L,
    val errorCause: Throwable? = null,
    val errorMessage: String? = null,
) : Throwable(errorMessage, errorCause)
