package co.yh.agilesoftware.bowling

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.collections.shouldHaveSize
import io.kotest.matchers.shouldBe

class BowlingGameTest : BehaviorSpec({

    Given("Bowling game with default value round") {
        val bowlingGame = BowlingGame(users = listOf(User("yuhyeon")))
        When("Create frame with bowling game") {
            val frames = bowlingGame.createFrames()
            Then("Return count of frames same size with default rounds") {
                frames shouldHaveSize 20
            }
            Then("Return users of game") {
                bowlingGame.users[0].name shouldBe "yuhyeon"
            }
        }
    }
})