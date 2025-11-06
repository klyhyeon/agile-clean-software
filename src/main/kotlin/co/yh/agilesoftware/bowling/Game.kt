package co.yh.agilesoftware.bowling

interface Game {
    val users: List<User>

    fun startGame()
}