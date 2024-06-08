package com.example.core.local.database

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

suspend fun MovieDatabase.delete() =
    withContext(Dispatchers.IO) {
        clearAllTables()
    }
