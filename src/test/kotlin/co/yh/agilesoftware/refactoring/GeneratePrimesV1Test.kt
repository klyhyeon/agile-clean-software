package co.yh.agilesoftware.refactoring

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class GeneratePrimesV1Test {

    @Test
    fun `initialize boolean array has 'false'`() {
        val booleanArray = BooleanArray(2)
        assertFalse(booleanArray[0])
    }

    @Test
    fun `test primes`() {
        val nullArray = GeneratePrimesV1.generatePrimes(0)
        assertEquals(0, nullArray.size)

        val minArray = GeneratePrimesV1.generatePrimes(2)
        assertEquals(1, minArray.size)
        assertEquals(2, minArray[0])

        val threeArray = GeneratePrimesV1.generatePrimes(3)
        assertEquals(2, threeArray.size)
        assertEquals(2, threeArray[0])
        assertEquals(3, threeArray[1])

        val centArray = GeneratePrimesV1.generatePrimes(100)
        assertEquals(25, centArray.size)
        assertEquals(97, centArray[24])
    }

    @Test
    fun `test exhaustive`() {
        for (i in 2 until 500) {
            verifyPrimeList(GeneratePrimesV1.generatePrimes(i))
        }
    }

    private fun verifyPrimeList(generatePrimes: IntArray) {
        for (i in 0 until generatePrimes.size) {
            verifyPrime(generatePrimes[i])
        }
    }

    private fun verifyPrime(i: Int) {
        for (factor in 2 until i) {
            assertTrue(i % factor != 0)
        }
    }
}