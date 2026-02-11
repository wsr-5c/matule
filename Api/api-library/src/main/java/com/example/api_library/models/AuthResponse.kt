package com.example.api_library.models

import com.google.gson.annotations.SerializedName

//модель ответа об авторизации
data class AuthResponse(
    //ответ - true (авторизован) false (не авторизован)
    @SerializedName("loginStatus")
    val loginStatus: Boolean
)
