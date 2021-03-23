package locks

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import server.Server

@Component
class LocksTerminator {

    @Autowired
    lateinit var server: Server

    fun getMessage() = "${server.getMessage()} via locks"

}
