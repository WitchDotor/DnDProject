package com.example.dndproject.data.model

import com.google.gson.annotations.SerializedName

data class BaseRaw<R>(
    @SerializedName("count") val count: Int,
    @SerializedName("result") val result: R,
    )