package co.yh.agilesoftware.bowling

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class FrameTest : BehaviorSpec ({

    Given("Create Frame object") {
        val frame = Frame()
        When("Start the Frame") {
            val score = frame.getScore()
            Then("Return users count") {
                score shouldBe(1)
            }
        }
    }
})