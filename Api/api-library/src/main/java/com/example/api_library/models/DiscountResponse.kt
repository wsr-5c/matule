package com.example.api_library.models

import android.accessibilityservice.GestureDescription
import com.google.gson.annotations.SerializedName

//модель ответа от сервера по запросу акций
data class DiscountResponse(
    @SerializedName("name")
    val name: String,
    @SerializedName("description")
    val description: String
)
