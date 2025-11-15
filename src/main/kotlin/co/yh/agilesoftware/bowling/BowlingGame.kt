package co.yh.agilesoftware.bowling

class BowlingGame(
    override val users: List<User>,
    val rounds: Int = 20,
) : Game {

    var frames: List<Frame> = emptyList()
        private set

    override fun startGame() {
        createFrames() 
    }

    fun createFrames(): List<Frame> {
        val tempFrames = mutableListOf<Frame>()
        for (i in 1..rounds) {
            tempFrames.add(Frame(i))
        }
        frames = tempFrames
        return frames
    }
}