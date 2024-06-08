package com.example.core.local.database


import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.core.local.convertor.DBTypeConvertor
import com.example.core.local.dao.PageKeyDao
import com.example.core.local.dao.PlayingMovieDao
import com.example.core.local.dao.PopularMovieDao
import com.example.core.local.dao.TotalCountDao
import com.example.core.local.dao.UpcomingMovieDao
import com.example.core.local.entity.PageKey
import com.example.core.local.entity.PlayingMovieEntity
import com.example.core.local.entity.PopularMovieEntity
import com.example.core.local.entity.TotalCount
import com.example.core.local.entity.UpcomingMovieEntity
import com.example.domain.BuildConfig

@Database(
    entities = [
        PageKey::class, TotalCount::class, PopularMovieEntity::class, UpcomingMovieEntity::class,
    PlayingMovieEntity::class
    ],
    exportSchema = BuildConfig.DATABASE_EXPORT_SCHEMA,
    version = BuildConfig.DATABASE_VERSION,
)
@TypeConverters(DBTypeConvertor::class)
abstract class MovieDatabase : RoomDatabase() {

    abstract fun pageKeysDao(): PageKeyDao
    abstract fun totalCountDao(): TotalCountDao
    abstract fun playingMovieDao(): PlayingMovieDao
    abstract fun upcomingMovieDao(): UpcomingMovieDao
    abstract fun popularMovieDao(): PopularMovieDao


}
