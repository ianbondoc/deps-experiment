package locks

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import javax.annotation.PostConstruct

@SpringBootApplication(scanBasePackages = ["server", "locks"])
class Application {

    @Autowired
    lateinit var locksTerminator: LocksTerminator

    @PostConstruct
    fun printMessage() {
        println(locksTerminator.getMessage())
    }

}

fun main() {
    SpringApplication.run(Application::class.java)
}