package cote.leet.from3001to4000

import org.example.cote.etc.bit.SmallestNumberWithAllSetBits
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SmallestNumberWithAllSetBitsTest {
    private val bits = SmallestNumberWithAllSetBits()

    @Test
    fun `First Case`() {
        val result = bits.smallestNumber(5)
        assertEquals(7, result)
    }

    @Test
    fun `Second Case`() {
        val result = bits.smallestNumber(10)
        assertEquals(15, result)
    }

    @Test
    fun `Third Case`() {
        val result = bits.smallestNumber(3)
        assertEquals(3, result)
    }
}