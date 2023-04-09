package dev.kataindie.katabe.controller

import dev.kataindie.katabe.model.UserResponse
import dev.kataindie.katabe.model.WebResponse
import dev.kataindie.katabe.service.UserService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(
    path = ["/api/users"],
    produces = [MediaType.APPLICATION_JSON_VALUE]
)
class UserController(val userService: UserService) {

    @GetMapping(value = ["/{id}"])
    fun getUser(@PathVariable("id") id: Long): WebResponse<UserResponse> {
        val userResponse = userService.findById(id)
        return WebResponse(
            status = "OK",
            message = "Success get user with id $id",
            data = userResponse
        )
    }
}