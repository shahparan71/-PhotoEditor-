package com.paran.bd.photoeditor.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.paran.bd.photoeditor.data.local.entities.DraftEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface DraftDao {
    @Query("SELECT * FROM drafts ORDER BY lastModified DESC")
    fun getAllDrafts(): Flow<List<DraftEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDraft(draft: DraftEntity): Long

    @Query("DELETE FROM drafts WHERE id = :id")
    suspend fun deleteDraft(id: Long)
}
