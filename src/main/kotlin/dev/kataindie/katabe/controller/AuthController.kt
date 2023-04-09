package dev.kataindie.katabe.controller

import dev.kataindie.katabe.model.*
import dev.kataindie.katabe.service.AuthService
import jakarta.validation.Valid
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(
    path = ["/api/auth"],
    produces = [MediaType.APPLICATION_JSON_VALUE],
    consumes = [MediaType.APPLICATION_JSON_VALUE]
)
class AuthController(val authService: AuthService) {
    @PostMapping(value = ["/register"])
    fun register(@Valid @RequestBody body: RegisterRequest): WebResponse<UserResponse> {
        val userResponse = authService.register(body)
        return WebResponse(
            status = "OK",
            message = "Register new user success",
            data = userResponse
        )
    }

    @PostMapping(value = ["/login"])
    fun login(@Valid @RequestBody body: LoginRequest): WebResponse<LoginResponse> {
        val userResponse = authService.login(body)
        return WebResponse(
            status = "OK",
            message = "Register new user success",
            data = userResponse
        )
    }
}