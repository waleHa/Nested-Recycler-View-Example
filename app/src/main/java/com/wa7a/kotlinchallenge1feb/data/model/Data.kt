package com.wa7a.kotlinchallenge1feb.data.model


import com.google.gson.annotations.SerializedName

data class  Data(
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("label")
    val label: String? = null,
    @SerializedName("records")
    val records: List<Record?>? = null,
    @SerializedName("title")
    val title: String? = null
)