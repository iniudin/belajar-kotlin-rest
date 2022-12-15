package dev.kataindie.katabe.service

import dev.kataindie.katabe.model.RegisterUserRequest
import dev.kataindie.katabe.model.UserResponse

interface UserService {
    fun create(request: RegisterUserRequest) : UserResponse
}