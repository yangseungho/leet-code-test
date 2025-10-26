package cote

import org.example.cote.greed.IntegerToRomen
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class IntegerToRomenTest {
    private val romen = IntegerToRomen()

    @Test
    fun `First Case`() {
        val result = romen.intToRoman(3749)
        assertEquals("MMMDCCXLIX", result)
    }

}