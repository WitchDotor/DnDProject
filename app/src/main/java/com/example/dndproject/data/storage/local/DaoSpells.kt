package com.example.dndproject.data.storage.local

import androidx.room.Dao
import androidx.room.Insert


@Dao
interface DaoSpells {

    @Insert
    fun addAllSpells(vararg spell: SpellEntity)
}