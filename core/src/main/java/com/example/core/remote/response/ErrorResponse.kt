package com.example.core.remote.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BaseErrorResponse(
    @field:Json(name = "result") val error: ErrorResponse?,
)

@JsonClass(generateAdapter = true)
data class ErrorResponse(
    @field:Json(name = "statusCode") val code: String?,
    @field:Json(name = "description") val description: String?,
    @field:Json(name = "message") val message: String?,
    @field:Json(name = "data") val MoreInfo: MoreInfo?,
)

/* in case lease registration and pma registration they start to return more info for error we need it in UI
* */

@JsonClass(generateAdapter = true)
data class MoreInfo(
    @field:Json(name = "date") val date: String?,
    @field:Json(name = "maxAmount") val maxAmount: Double?,
)
