package co.yh.agilesoftware.bowling

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class FrameTest : BehaviorSpec ({

    Given("Create Frame object") {
        val frame = Frame(users = 2)
        When("Start the Frame") {
            val users = frame.start()
            Then("Return users count") {
                users shouldBe(2)
            }
        }
    }
})