package co.yh.agilesoftware.bowling

import co.yh.agilesoftware.exception.UserNotFoundException
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldInclude

class FrameTest : BehaviorSpec ({

    Given("Create Frame") {
        val frame = Frame(1)
        When("Get user not existing") {
            val exception = shouldThrow<UserNotFoundException> {
                frame.getUserScore("yuhyeon")
            }
            Then("Throw exception with given name") {
                exception.message shouldInclude "yuhyeon"
            }
        }
        When("Get frame round") {
            val round = frame.round
            Then("Round should be 1") {
                round shouldBe 1
            }
        }
    }
})