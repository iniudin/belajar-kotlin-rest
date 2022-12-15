package dev.kataindie.katabe.model

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank

data class RegisterUserRequest (
    @field:NotBlank
    val name: String,

    @field:NotBlank
    val phone: String,

    @field:Email
    val email: String,

    @field:NotBlank
    @field:Min(8)
    val password: String
)