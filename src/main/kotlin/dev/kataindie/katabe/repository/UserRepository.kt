package dev.kataindie.katabe.repository

import dev.kataindie.katabe.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long>{
    fun findByEmail(email: String) : User?
}