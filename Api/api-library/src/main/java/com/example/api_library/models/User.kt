package com.example.api_library.models

import com.google.gson.annotations.SerializedName

//модель пользователя
data class User(
    //ID
    @SerializedName("id")
    val id: Int,
    //Имя
    @SerializedName("FName")
    val FName:String,
    //Фамилия
    @SerializedName("LName")
    val LName:String,
    //Пол
    @SerializedName("gender")
    val gender:String,
    //почта
    @SerializedName("email")
    val email: String,
    //логин
    @SerializedName("login")
    val login: String,
    //дата рождения
    @SerializedName("birthday")
    val birthday: String,
    //пароль
    @SerializedName("password")
    val password:String
)