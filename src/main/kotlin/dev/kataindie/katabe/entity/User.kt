package dev.kataindie.katabe.entity

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "users")
data class User(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,

    @Column(name = "name", nullable = false)
    var name: String,

    @Column(name = "phone", unique = true, nullable = false)
    var phone: String,

    @Column(name = "email", unique = true, nullable = false)
    var email: String,

    @Column(name = "username", unique = true, nullable = false)
    var username: String,

    @Column(name = "password", nullable = false)
    var password: String,

    @Column(name = "created_at")
    var createdAt: Date,

    @Column(name = "updated_at")
    var updatedAt: Date?
)