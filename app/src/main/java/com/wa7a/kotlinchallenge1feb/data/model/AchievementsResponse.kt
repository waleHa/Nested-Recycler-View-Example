package com.wa7a.kotlinchallenge1feb.data.model


import com.google.gson.annotations.SerializedName

data class AchievementsResponse(
    @SerializedName("data")
    val data: List<Data>? = null
)