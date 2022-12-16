package dev.kataindie.katabe.controller

import dev.kataindie.katabe.model.RegisterUserRequest
import dev.kataindie.katabe.model.UserResponse
import dev.kataindie.katabe.model.WebResponse
import dev.kataindie.katabe.service.UserService
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(val userService: UserService) {
    @PostMapping(
        value = ["/api/register"],
        consumes = ["application/json"],
        produces = ["application/json"]
    )
    fun register(@Valid @RequestBody body: RegisterUserRequest): WebResponse<UserResponse> {
        val userResponse = userService.create(body)
        return  WebResponse(
            code = 200,
            status = "OK",
            data = userResponse
        )
    }
    @GetMapping(
        value = ["/api/users/{id}"],
        produces = ["application/json"]
    )
    fun getUser(@PathVariable("id") id: Long): WebResponse<UserResponse>{
        val userResponse = userService.get(id)
        return  WebResponse(
            code = 200,
            status = "OK",
            data = userResponse
        )
    }
}