package dev.kataindie.katabe.entity

import jakarta.persistence.*
import java.util.*

@Entity()
@Table(name = "refresh_token")
data class RefreshToken(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,

    @OneToOne @JoinColumn(name = "user_id", referencedColumnName = "id")
    var name: User,

    @Column(nullable = false, unique = true)
    var token: String,

    @Column(nullable = false)
    var expiryDate: Date
)