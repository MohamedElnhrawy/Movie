package com.example.core.remote.parser

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class DateJasonAdapter : JsonAdapter<Date>() {
    private val responseSDF = SimpleDateFormat(RESPONSE_FORMAT, Locale.US)
    private val theOtherResponseSDF = SimpleDateFormat(THE_OTHER_RESPONSE_FORMAT, Locale.US)
    private val requestSDF = SimpleDateFormat(REQUEST_FORMAT, Locale.US)
    private val transactionSDF = SimpleDateFormat(TRANSACTION_DATE_FORMAT, Locale.US)
    private val contractPDFSDF = SimpleDateFormat(CONTRACT_PDF_DATE_FORMAT, Locale.US)

    override fun fromJson(reader: JsonReader): Date? {
        if (reader.peek() == JsonReader.Token.NULL) {
            return reader.nextNull()
        }

        val dateStr = reader.nextString()
        return responseSDF.parseDate(dateStr)
            ?: theOtherResponseSDF.parseDate(dateStr)
            ?: transactionSDF.parseDate(dateStr)
            ?: requestSDF.parseDate(dateStr)
            ?: contractPDFSDF.parseDate(dateStr)
    }

    override fun toJson(
        writer: JsonWriter,
        value: Date?,
    ) {
        if (value == null) {
            writer.nullValue()
        } else {
            writer.value(requestSDF.format(value))
        }
    }

    private fun SimpleDateFormat.parseDate(dateStr: String): Date? =
        try {
            parse(dateStr)
        } catch (_: Exception) {
            null
        }

    companion object {
        private const val RESPONSE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss"
        private const val THE_OTHER_RESPONSE_FORMAT = "yyyy-MM-dd HH:mm:ss"
        private const val REQUEST_FORMAT = "yyyy-MM-dd"
        private const val TRANSACTION_DATE_FORMAT = "yyyy-MM-dd HH:mm"
        private const val CONTRACT_PDF_DATE_FORMAT = "d/M/yyyy"
    }
}
