package dev.kataindie.katabe.model

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

data class RegisterRequest(
    @field:NotBlank
    val name: String,

    @field:NotBlank
    val phone: String,

    @field:Email
    val email: String,

    @field:NotBlank
    @field:Size(min = 8, max = 50)
    val password: String
)