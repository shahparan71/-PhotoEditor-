package com.paran.bd.photoeditor.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

import com.paran.bd.photoeditor.data.local.dao.DraftDao
import com.paran.bd.photoeditor.data.local.entities.DraftEntity

@Database(entities = [DraftEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun draftDao(): DraftDao
}
