package dev.kataindie.katabe.auth

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

object Password {
    fun hash(password: String): String {
        return BCryptPasswordEncoder().encode(password)
    }

    fun compare(password: String, hashPassword: String): Boolean {
        return BCryptPasswordEncoder().matches(password, hashPassword)
    }
}