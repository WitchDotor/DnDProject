package com.example.dndproject.domain.repository

interface DnDRepository {
    fun getAllSpells()
    fun uploadSpellsToLocalStorage()
    fun getAllMonsters()
    fun uploadMonstersToLocalStorage()
}