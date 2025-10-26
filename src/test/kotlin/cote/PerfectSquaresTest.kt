package cote

import org.example.cote.dp.PerfectSquares
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PerfectSquaresTest {
    private val perfectSquares = PerfectSquares()

    @Test
    fun `First Case`() {
        val result = perfectSquares.numSquares(12)
        assertEquals(3, result)
    }

    @Test
    fun `Second Case`() {
        val result = perfectSquares.numSquares(13)
        assertEquals(2, result)
    }
}