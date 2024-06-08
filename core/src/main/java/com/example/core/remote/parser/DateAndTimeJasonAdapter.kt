package com.example.core.remote.parser

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import java.text.SimpleDateFormat
import java.util.Locale

class DateAndTimeJasonAdapter : JsonAdapter<DateAndTime>() {
    private val responseSDF = SimpleDateFormat(RESPONSE_FORMAT, Locale.US)
    private val requestSDF = SimpleDateFormat(REQUEST_FORMAT, Locale.US)

    override fun fromJson(reader: JsonReader): DateAndTime? {
        if (reader.peek() == JsonReader.Token.NULL) {
            return reader.nextNull()
        }

        val dateStr = reader.nextString()
        return try {
            DateAndTime(responseSDF.parse(dateStr))
        } catch (_: Exception) {
            return try {
                DateAndTime(requestSDF.parse(dateStr))
            } catch (_: Exception) {
                null
            }
        }
    }

    override fun toJson(
        writer: JsonWriter,
        value: DateAndTime?,
    ) {
        if (value == null) {
            writer.nullValue()
        } else {
            writer.value(requestSDF.format(value.date))
        }
    }

    companion object {
        private const val RESPONSE_FORMAT = "yyyy-MM-dd"
        private const val REQUEST_FORMAT = "yyyy-MM-dd'T'HH:mm:ss"
    }
}
