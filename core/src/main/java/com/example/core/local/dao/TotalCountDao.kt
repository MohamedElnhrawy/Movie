package com.example.core.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.core.local.entity.TotalCount
import kotlinx.coroutines.flow.Flow

@Dao
interface TotalCountDao {
    @Query("SELECT * FROM total_count WHERE id = :id")
    fun getTotalCountById(id: String): Flow<TotalCount?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTotalCount(totalCount: TotalCount)

    @Query("DELETE FROM total_count WHERE id = :id")
    suspend fun deleteTotalCountById(id: String)

    @Query("DELETE FROM total_count")
    suspend fun deleteAll()
}
