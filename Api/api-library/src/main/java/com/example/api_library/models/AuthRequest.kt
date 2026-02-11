package com.example.api_library.models

import com.google.gson.annotations.SerializedName

//модель запроса на авторизацию
data class AuthRequest(
    //логин
    @SerializedName("login")
    val login: String,
    //пароль
    @SerializedName("password")
    val password: String
)