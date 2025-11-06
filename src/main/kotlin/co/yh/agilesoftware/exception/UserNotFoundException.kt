package co.yh.agilesoftware.exception

import java.lang.RuntimeException

class UserNotFoundException(
    val userName: String,
) : RuntimeException() {

    override val message: String
        get() = "User name: $userName not found"
}