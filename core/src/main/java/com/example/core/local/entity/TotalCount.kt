package com.example.core.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "total_count")
data class TotalCount(
    @PrimaryKey val id: String,
    @ColumnInfo(name = "count") val count: Int,
)
