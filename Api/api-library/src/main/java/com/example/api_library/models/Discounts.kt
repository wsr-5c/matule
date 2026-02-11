package com.example.api_library.models

import com.google.gson.annotations.SerializedName

//Модель акций
data class Discounts(
    //ID
    @SerializedName("disId")
    val disId:Int,
    //название акции
    @SerializedName("name")
    val name: String,
    //описание акции
    @SerializedName("description")
    val description: String
)
