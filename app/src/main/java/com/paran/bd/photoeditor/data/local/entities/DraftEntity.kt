package com.paran.bd.photoeditor.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "drafts")
data class DraftEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val imageUri: String,
    val lastModified: Long = System.currentTimeMillis(),
    // We will expand this with filter history, layers, etc. later
)
