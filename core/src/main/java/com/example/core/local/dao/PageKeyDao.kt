package com.example.core.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.core.local.entity.PageKey

@Dao
interface PageKeyDao {
    @Query("SELECT * FROM page_key WHERE item_id = :itemId AND class_hash = :classHash AND source = :source")
    suspend fun getPageKey(
        itemId: String,
        classHash: Int,
        source: String? = "",
    ): PageKey?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertKeys(keys: List<PageKey>)

    @Query("DELETE FROM page_key WHERE class_hash = :classHash AND source = :source")
    suspend fun deleteKeysByClassHash(
        classHash: Int,
        source: String?,
    )

    @Query("DELETE FROM page_key WHERE class_hash = :classHash AND item_id = :itemId")
    suspend fun deleteKeysByItemId(
        classHash: Int,
        itemId: String,
    ): Int

    @Query("DELETE FROM page_key")
    suspend fun deleteAll()
}
