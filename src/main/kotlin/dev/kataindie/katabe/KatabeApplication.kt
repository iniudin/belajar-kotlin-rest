package dev.kataindie.katabe

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [UserDetailsServiceAutoConfiguration::class])
class KatabeApplication

fun main(args: Array<String>) {
    runApplication<KatabeApplication>(*args)
}
