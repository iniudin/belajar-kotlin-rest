package dev.kataindie.katabe.model

data class LoginResponse(
    val accessToken: String,
    val refreshToken: String
)
