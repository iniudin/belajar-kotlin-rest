package dev.kataindie.katabe.service

import dev.kataindie.katabe.entity.User
import dev.kataindie.katabe.error.NotFoundException
import dev.kataindie.katabe.model.RegisterUserRequest
import dev.kataindie.katabe.model.UserResponse
import dev.kataindie.katabe.repository.UserRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserServiceImpl(val repository: UserRepository) : UserService{
    override fun create(request: RegisterUserRequest): UserResponse {
        val user = User(
            id = null,
            name = request.name,
            phone = request.phone,
            email = request.email,
            password = request.password,
            createdAt = Date(),
            updatedAt = null
        )
        repository.save(user)
        return convertToUserResponse(user)
    }

    override fun get(id: Long): UserResponse {
        val user = repository.findByIdOrNull(id)
        if (user == null) {
            throw NotFoundException()
        } else {
            return convertToUserResponse(user)
        }
    }

    private fun convertToUserResponse(user: User) : UserResponse {
        return UserResponse(
            id = user.id,
            name = user.name,
            phone = user.phone,
            email = user.email,
            createdAt = user.createdAt,
            updatedAt = user.updatedAt
        )
    }
}