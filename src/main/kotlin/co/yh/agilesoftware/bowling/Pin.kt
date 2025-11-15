package co.yh.agilesoftware.bowling

class Pin {

    companion object {
        fun getRandomPins(pinsOnFrame: Int = 10): Int {
            if (pinsOnFrame <= 0) return 0
            return (1..pinsOnFrame).random()
        }
    }
}