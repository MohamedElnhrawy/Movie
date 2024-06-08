package com.example.core.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "page_key",
    indices = [Index(value = ["class_hash", "pageKey", "source"])],
)
data class PageKey(
    @ColumnInfo(name = "item_id") val itemId: String,
    @ColumnInfo(name = "class_hash") val classHash: Int,
    @ColumnInfo(name = "pageKey") val pageKey: Int,
    @ColumnInfo(name = "item_order") val itemOrder: Int,
    @ColumnInfo(name = "source") val source: String?,
    @PrimaryKey(autoGenerate = true) val id: Long = 0L,
)
