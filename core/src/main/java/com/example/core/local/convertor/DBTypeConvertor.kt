package com.example.core.local.convertor

import androidx.room.TypeConverter
import com.example.core.utils.parseAs
import java.util.Date

class DBTypeConvertor {
    @TypeConverter
    fun formJson(value: String?): List<Long>? {
        return value?.parseAs<List<Long>>()
    }

    @TypeConverter
    fun toJson(list: List<Long>?): String? {
        return list?.parseAs()
    }

    @TypeConverter
    fun formJson(list: List<String>?): String? {
        return list?.parseAs()
    }

    @TypeConverter
    fun toJson(value: String?): List<String>? {
        return value?.parseAs<List<String>>()
    }

    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {
        return value?.let { Date(it) }
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time
    }
}
