package co.yh.agilesoftware.bowling

class User(
    val name: String,
) {
    fun throwBall(remainingPins: Int = 10): Int {
        return Pin.getRandomPins(remainingPins)
    }
}