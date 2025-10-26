package cote

import org.example.cote.simulation.ZigzagConversion
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ZigzagConversionTest {
    private val zigzag = ZigzagConversion()

    @Test
    fun `First Case`() {
        val str = "PAYPALISHIRING"
        val result = zigzag.convert(str, 3)
        assertEquals("PAHNAPLSIIGYIR", result)
    }

    @Test
    fun `Second Case`() {
        val str = "PAYPALISHIRING"
        val result = zigzag.convert(str, 4)
        assertEquals("PINALSIGYAHRPI", result)
    }

    @Test
    fun `Third Case`() {
        val str = "A"
        val result = zigzag.convert(str, 1)
        assertEquals("A", result)
    }
}