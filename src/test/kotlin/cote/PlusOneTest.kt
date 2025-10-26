package cote

import org.example.cote.simulation.PlusOne
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class PlusOneTest {
    private val plusOne = PlusOne()

    @Test
    fun `First Case`() {
        val digits = intArrayOf(1,2,3)
        val result = plusOne.plusOne(digits)
        assertContentEquals(intArrayOf(1,2,4), result)
    }

    @Test
    fun `Second Case`() {
        val digits = intArrayOf(4,3,2,1)
        val result = plusOne.plusOne(digits)
        assertContentEquals(intArrayOf(4,3,2,2), result)
    }

    @Test
    fun `Third Case`() {
        val digits = intArrayOf(9)
        val result = plusOne.plusOne(digits)
        assertContentEquals(intArrayOf(1,0), result)
    }
}