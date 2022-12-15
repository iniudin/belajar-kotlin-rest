package dev.kataindie.katabe

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KatabeApplication

fun main(args: Array<String>) {
    runApplication<KatabeApplication>(*args)
}
