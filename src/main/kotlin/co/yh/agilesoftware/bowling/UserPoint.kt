package co.yh.agilesoftware.bowling

 class UserPoint(
    val user: User,
    val points: Int = 0,
    var pins: Int = 0,
    var sparePins: Int = 0,
) {
}