package com.wa7a.kotlinchallenge1feb.network

import com.wa7a.kotlinchallenge1feb.BuildConfig
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitBuilder {
    val BASE_URL = BuildConfig.baseURL

    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    val api = retrofit.create(API::class.java)
}