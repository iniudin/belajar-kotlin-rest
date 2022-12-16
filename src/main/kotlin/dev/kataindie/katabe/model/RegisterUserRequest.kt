package dev.kataindie.katabe.model

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank

data class RegisterUserRequest (
    @field:NotBlank
    val name: String,

    @field:NotBlank
    val phone: String,

    @field:Email
    val email: String,

    @field:NotBlank
    val password: String
)