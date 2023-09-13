package com.example.dndproject.data.remoute

import retrofit2.http.GET
import retrofit2.http.Query

interface SpellsService {
        @GET("spells/")
        fun getSpells()
}