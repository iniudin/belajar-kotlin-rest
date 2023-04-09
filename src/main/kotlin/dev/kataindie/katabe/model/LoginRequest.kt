package dev.kataindie.katabe.model

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank

data class LoginRequest(
    @field:Email
    val email: String,

    @field:NotBlank
    val password: String
)
