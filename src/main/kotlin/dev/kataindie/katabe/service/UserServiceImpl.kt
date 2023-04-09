package dev.kataindie.katabe.service

import dev.kataindie.katabe.entity.User
import dev.kataindie.katabe.exception.NotFoundException
import dev.kataindie.katabe.model.UserResponse
import dev.kataindie.katabe.repository.UserRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(val repository: UserRepository) : UserService{

    override fun findById(id: Long): UserResponse {
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