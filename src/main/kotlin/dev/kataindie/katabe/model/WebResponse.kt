package dev.kataindie.katabe.model

data class WebResponse<T>(
    val status: String,
    val message: String,
    val data: T?
)
