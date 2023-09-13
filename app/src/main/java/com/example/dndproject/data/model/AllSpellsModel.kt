package com.example.dndproject.data.model

import com.google.gson.annotations.SerializedName

data class AllSpellsModel(
    @SerializedName("index") val index: String,
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String,
)