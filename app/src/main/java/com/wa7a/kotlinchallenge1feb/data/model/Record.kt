package com.wa7a.kotlinchallenge1feb.data.model


import com.google.gson.annotations.SerializedName

data class Record(
    @SerializedName("active")
    val active: Boolean? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("image")
    val image: String? = null,
    @SerializedName("label")
    val label: String? = null,
    @SerializedName("title")
    val title: String? = null
)