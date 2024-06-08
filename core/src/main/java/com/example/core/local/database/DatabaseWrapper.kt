package com.example.core.local.database

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase

class DatabaseWrapper {
    fun databaseBuilder(application: Application, databaseClass: Class<MovieDatabase>, dbName: String): RoomDatabase.Builder<MovieDatabase> {
        return Room.databaseBuilder(application, databaseClass, dbName)
    }
}