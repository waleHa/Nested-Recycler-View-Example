package com.wa7a.kotlinchallenge1feb.data.api

import com.wa7a.kotlinchallenge1feb.data.model.AchievementsResponse
import retrofit2.Response
import retrofit2.http.GET

interface API {
    @GET("/achievements")
    suspend fun getAchievementsResponse(): Response<AchievementsResponse>
}