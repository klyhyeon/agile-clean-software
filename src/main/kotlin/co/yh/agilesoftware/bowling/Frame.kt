package co.yh.agilesoftware.bowling

import co.yh.agilesoftware.exception.UserNotFoundException

class Frame(
    val round: Int,
    val userPoints: List<UserPoint> = emptyList(),
) {

    fun getUserPoint(userName: String): UserPoint {
        return userPoints.firstOrNull { it.user.name == userName } ?: throw UserNotFoundException(userName)
    }

    fun play() {
        for (userPoint in userPoints) {
            userPoint.pins = userPoint.user.throwBall()
            // TODO refactor
            if (userPoint.pins != 10) {
                userPoint.sparePins =
                    userPoint.user.throwBall(10 - userPoint.pins)
            }
        }
    }
}