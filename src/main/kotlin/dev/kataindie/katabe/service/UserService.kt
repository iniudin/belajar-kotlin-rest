package dev.kataindie.katabe.service

import dev.kataindie.katabe.model.UserResponse

interface UserService {
    fun findById(id: Long) : UserResponse
}