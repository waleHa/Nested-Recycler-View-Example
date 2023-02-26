package com.wa7a.kotlinchallenge1feb.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wa7a.kotlinchallenge1feb.data.model.AchievementsResponse
import com.wa7a.kotlinchallenge1feb.repository.MainRepository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel : ViewModel() {
    private val repository = MainRepository()

    private val _achievements = MutableLiveData<Response<AchievementsResponse>>()
    val achievements: LiveData<Response<AchievementsResponse>> = _achievements

    private fun getAchievements() = viewModelScope.launch {
        repository.getList(_achievements)
    }


    init {
        getAchievements()
    }
}