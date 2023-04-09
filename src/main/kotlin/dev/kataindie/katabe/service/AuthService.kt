package dev.kataindie.katabe.service

import dev.kataindie.katabe.model.LoginRequest
import dev.kataindie.katabe.model.LoginResponse
import dev.kataindie.katabe.model.RegisterRequest
import dev.kataindie.katabe.model.UserResponse

interface AuthService {
    fun register(request: RegisterRequest) : UserResponse
    fun login(request: LoginRequest) : LoginResponse
}