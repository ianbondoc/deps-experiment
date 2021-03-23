package server

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import javax.annotation.PostConstruct

@SpringBootApplication
class Application {
    @Autowired
    lateinit var server: Server

    @PostConstruct
    fun printMessage() {
        println(server.getMessage())
    }
}

fun main() {
    SpringApplication.run(Application::class.java)
}