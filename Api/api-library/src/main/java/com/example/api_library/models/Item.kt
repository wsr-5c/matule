package com.example.api_library.models

import com.google.gson.annotations.SerializedName

//Модель товара
data class Item(
    //id
    @SerializedName("iId")
    val iId: Int,
    //название товара
    @SerializedName("iName")
    val iName: String,
    //описание товара
    @SerializedName("iDesc")
    val iDesc: String,
    //цена
    @SerializedName("price")
    val price: Float,
    //категория
    @SerializedName("cat")
    val cat: String
)
