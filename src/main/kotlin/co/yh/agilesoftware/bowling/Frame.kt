package co.yh.agilesoftware.bowling

import co.yh.agilesoftware.exception.UserNotFoundException

class Frame(
    val userScores: List<UserScore> = emptyList(),
) {

    fun getUserScore(userName: String): UserScore {
        return userScores.firstOrNull { it.user.name == userName } ?: throw UserNotFoundException(userName)
    }
}