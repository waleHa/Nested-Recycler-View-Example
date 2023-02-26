package com.wa7a.kotlinchallenge1feb.repository

import androidx.lifecycle.MutableLiveData
import com.wa7a.kotlinchallenge1feb.data.model.AchievementsResponse
import com.wa7a.kotlinchallenge1feb.network.RetrofitBuilder
import retrofit2.Response

class MainRepository {

    suspend fun getList(mutableLiveData: MutableLiveData<Response<AchievementsResponse>>) {
        val response = RetrofitBuilder.api.getAchievementsResponse()
        mutableLiveData.postValue(response)
    }

}