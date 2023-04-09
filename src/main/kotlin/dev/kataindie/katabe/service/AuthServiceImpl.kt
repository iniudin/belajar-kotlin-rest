package dev.kataindie.katabe.service

import dev.kataindie.katabe.auth.Password
import dev.kataindie.katabe.entity.User
import dev.kataindie.katabe.exception.LoginFailException
import dev.kataindie.katabe.model.LoginRequest
import dev.kataindie.katabe.model.LoginResponse
import dev.kataindie.katabe.model.RegisterRequest
import dev.kataindie.katabe.model.UserResponse
import dev.kataindie.katabe.repository.UserRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class AuthServiceImpl(val repository: UserRepository) : AuthService {
    override fun register(request: RegisterRequest): UserResponse {
        val user = User(
            id = null,
            name = request.name,
            phone = request.phone,
            email = request.email,
            password = Password.hash(password = request.password),
            createdAt = Date(),
            updatedAt = null
            )

        repository.save(user)
        return UserResponse(
            id = user.id,
            name = user.name,
            phone = user.phone,
            email = user.email,
            createdAt = user.createdAt,
            updatedAt = user.updatedAt
        )
    }

    override fun login(request: LoginRequest): LoginResponse {
        val user = repository.findByEmail(request.email) ?: throw LoginFailException()
        if (!Password.compare(request.password, user.password)) {
            throw LoginFailException()
        }

        return LoginResponse(accessToken = "", refreshToken = "");
    }
}