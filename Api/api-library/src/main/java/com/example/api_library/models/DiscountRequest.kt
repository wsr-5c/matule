package com.example.api_library.models

import com.google.gson.annotations.SerializedName

//Запрос на получении акции
data class DiscountRequest(
    //ищем акцию по id
    @SerializedName("disId")
    val disId:Int
)
