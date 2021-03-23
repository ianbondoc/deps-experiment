package locks

import server.Server

class LocksTerminator {

    val server = Server()

    fun getMessage() = server.getMessage()

}

fun main() {
    println(LocksTerminator().getMessage())
}