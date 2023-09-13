package com.example.dndproject.data.remoute

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class DnDSpellsStorage {

    private val retrofit: Retrofit = buildRetrofit()
    private val service: SpellsService = retrofit.create(SpellsService::class.java)

    fun getSpells() = service.getSpells()

    private fun buildRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://www.dnd5eapi.co/docs/#get-/api/")
            .client(
                OkHttpClient.Builder()
                    .addInterceptor(HttpLoggingInterceptor().apply {
                        level = HttpLoggingInterceptor.Level.BODY
                    })
                    .build()
            )
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}