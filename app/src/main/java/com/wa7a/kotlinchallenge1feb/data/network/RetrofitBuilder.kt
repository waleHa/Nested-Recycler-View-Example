package com.wa7a.kotlinchallenge1feb.data.network

import com.wa7a.kotlinchallenge1feb.BuildConfig
import com.wa7a.kotlinchallenge1feb.data.api.API
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {
    private val BASE_URL = BuildConfig.baseURL

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    val achievementApi: API = retrofit.create(API::class.java)
}