package co.yh.agilesoftware.refactoring

import kotlin.math.sqrt

class GeneratePrimesV1 {

    companion object {
        fun generatePrimes(maxValue: Int): IntArray {
            if (maxValue >= 2) {
                val size = maxValue + 1
                val flags = BooleanArray(size)
                for (i in 0 until size) {
                    flags[i] = true
                }
                flags[0] = false
                flags[1] = false
                for (i in 2 until sqrt(size.toDouble()).toInt() + 1) {
                    if (flags[i]) {
                        for (j in 2 * i until size step i) {
                            flags[j] = false
                        }
                    }
                }
                var count = 0
                for (i in 0 until size) {
                    if (flags[i]) count++
                }

                val primes = IntArray(count)

                var j = 0
                for (i in 0 until size) {
                    if (flags[i]) primes[j++] = i
                }
                return primes
            } else {
                return IntArray(0)
            }
        }
    }
}