package cote.leet.from1001to2000

import org.example.cote.math.NumberOfSubstringsWithOnly1s
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class NumberOfSubstringsWithOnly1sTest {
    private val number = NumberOfSubstringsWithOnly1s()

    @Test
    fun `First Case`() {
        val s = "0110111"
        val result = number.numSub(s)
        assertEquals(9, result)
    }

    @Test
    fun `Second Case`() {
        val s = "101"
        val result = number.numSub(s)
        assertEquals(2, result)
    }

    @Test
    fun `Third Case`() {
        val s = "111111"
        val result = number.numSub(s)
        assertEquals(21, result)
    }
}