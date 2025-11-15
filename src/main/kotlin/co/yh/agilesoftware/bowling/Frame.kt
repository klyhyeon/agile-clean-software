package co.yh.agilesoftware.bowling

import co.yh.agilesoftware.exception.UserNotFoundException

class Frame(
    val round: Int,
    val userScores: List<UserScore> = emptyList(),
    private var pins: Int = 0,
) {

    fun getUserScore(userName: String): UserScore {
        return userScores.firstOrNull { it.user.name == userName } ?: throw UserNotFoundException(userName)
    }

    fun getRandomPins(remainingPins: Int = 10): Int {
        if (remainingPins <= 0) return 0
        return (1..remainingPins).random()
    }

    fun play() {
        for (userScore in userScores) {
            pins = getRandomPins()
        }
    }
}