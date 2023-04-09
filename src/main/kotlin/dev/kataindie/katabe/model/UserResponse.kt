package dev.kataindie.katabe.model

import java.util.*

data class UserResponse(
    val id: Long?,

    var name: String,

    var phone: String,

    var email: String,

    var createdAt: Date?,

    var updatedAt: Date?
)