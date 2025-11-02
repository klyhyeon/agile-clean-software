package co.yh.agilesoftware.refactoring

import kotlin.math.sqrt

class GeneratePrimesV1 {

    companion object {

        lateinit var crossedOut: BooleanArray
        var size: Int = 0


        fun generatePrimes(maxValue: Int): IntArray {
            if (maxValue < 2) return IntArray(0)
            size = maxValue + 1

            uncrossIntegerUpTo()
            crossMultiples()
            return getPrimes()
        }

        private fun uncrossIntegerUpTo() {
            crossedOut = BooleanArray(size)
            crossedOut[0] = true
            crossedOut[1] = true
        }

        private fun crossMultiples() {
            val size = crossedOut.size
            for (i in 2 until sqrt(size.toDouble()).toInt() + 1) {
                if (notCrossed(i)) {
                    crossMultiplesOf(i, size)
                }
            }
        }

        private fun crossMultiplesOf(i: Int, size: Int) {
            for (j in 2 * i until size step i) {
                crossedOut[j] = true
            }
        }

        private fun notCrossed(i: Int): Boolean {
            return !crossedOut[i]
        }

        private fun getPrimes(): IntArray {
            val countOfPrimes = countOfPrimes()
            return putPrimesIntoResult(countOfPrimes)
        }

        private fun putPrimesIntoResult(count: Int): IntArray {
            val primes = IntArray(count)
            var j = 0
            for (i in 2 until size) {
                if (notCrossed(i)) primes[j++] = i
            }
            return primes
        }

        private fun countOfPrimes(): Int {
            var count = 0
            for (i in 0 until size) {
                if (notCrossed(i)) count++
            }
            return count
        }
    }
}