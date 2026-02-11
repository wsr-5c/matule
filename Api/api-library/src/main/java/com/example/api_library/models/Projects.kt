package com.example.api_library.models

import com.google.gson.annotations.SerializedName

//модель проектов
data class Projects(
    //id
    @SerializedName("pId")
    val pId: Int,
    //название проекта
    @SerializedName("pName")
    val pName: String,
    //дата создания
    @SerializedName("creationD")
    val creationD: String,
    //дата окончания
    @SerializedName("endD")
    val endD: String,
    //кому
    @SerializedName("to")
    val to: String,
    //источник описания
    @SerializedName("source")
    val source: String,
    //категория
    @SerializedName("category")
    val category: String
)

