package com.wa7a.kotlinchallenge1feb.data.repository

import androidx.lifecycle.MutableLiveData
import com.wa7a.kotlinchallenge1feb.data.model.AchievementsResponse
import com.wa7a.kotlinchallenge1feb.data.network.RetrofitBuilder
import retrofit2.Response

class MainRepository {

    suspend fun getList(mutableLiveData: MutableLiveData<Response<AchievementsResponse>>) {
        val response = RetrofitBuilder.achievementApi.getAchievementsResponse()
        mutableLiveData.postValue(response)
    }

}