package com.example.core.local.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.core.local.entity.PlayingMovieEntity
import com.example.core.local.entity.PopularMovieEntity
import com.example.core.local.entity.UpcomingMovieEntity

@Dao
interface PopularMovieDao {
    @Query(
        "SELECT popular_movie.* FROM popular_movie INNER JOIN page_key ON page_key.item_id = popular_movie.id " +
            "WHERE page_key.source = :source AND page_key.class_hash = :classHash " +
            "ORDER BY page_key.pageKey, page_key.item_order",
    )
    fun listMovies(
        source: String,
        classHash: Int = PopularMovieEntity::class.java.name.hashCode(),
    ): PagingSource<Int, PopularMovieEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(contracts: List<PopularMovieEntity>)

    @Query("DELETE FROM popular_movie")
    suspend fun deleteAllContracts()

    @Query("DELETE FROM popular_movie WHERE source = :source")
    suspend fun deleteAllMoviesFromSource(source: String)

    @Query("SELECT * FROM popular_movie where id in (:ids) ")
    fun getAllMoviesByIds(ids: List<Long>): List<PopularMovieEntity>
}

@Dao
interface UpcomingMovieDao {
    @Query(
        "SELECT upcoming_movie.* FROM upcoming_movie INNER JOIN page_key ON page_key.item_id = upcoming_movie.id " +
                "WHERE page_key.source = :source AND page_key.class_hash = :classHash " +
                "ORDER BY page_key.pageKey, page_key.item_order",
    )
    fun listMovies(
        source: String,
        classHash: Int = UpcomingMovieEntity::class.java.name.hashCode(),
    ): PagingSource<Int, UpcomingMovieEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(contracts: List<UpcomingMovieEntity>)

    @Query("DELETE FROM upcoming_movie")
    suspend fun deleteAllContracts()

    @Query("DELETE FROM upcoming_movie WHERE source = :source")
    suspend fun deleteAllMoviesFromSource(source: String)

    @Query("SELECT * FROM upcoming_movie where id in (:ids) ")
    fun getAllMoviesByIds(ids: List<Long>): List<UpcomingMovieEntity>
}


@Dao
interface PlayingMovieDao {
    @Query(
        "SELECT playing_movie.* FROM playing_movie INNER JOIN page_key ON page_key.item_id = playing_movie.id " +
                "WHERE page_key.source = :source AND page_key.class_hash = :classHash " +
                "ORDER BY page_key.pageKey, page_key.item_order",
    )
    fun listMovies(
        source: String,
        classHash: Int = PlayingMovieEntity::class.java.name.hashCode(),
    ): PagingSource<Int, PlayingMovieEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(contracts: List<PlayingMovieEntity>)

    @Query("DELETE FROM playing_movie")
    suspend fun deleteAllContracts()

    @Query("DELETE FROM playing_movie WHERE source = :source")
    suspend fun deleteAllMoviesFromSource(source: String)

    @Query("SELECT * FROM playing_movie where id in (:ids) ")
    fun getAllMoviesByIds(ids: List<Long>): List<PlayingMovieEntity>
}
