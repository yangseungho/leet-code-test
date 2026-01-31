package cote.leet.from1001to2000

import org.example.cote.NumberOfWaysToPaint3Grid
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class NumberOfWaysToPaint3GridTest {
    private val numberOfWays = NumberOfWaysToPaint3Grid()

    @Test
    fun `First Case`() {
        val result = numberOfWays.numOfWays(1)
        assertEquals(12, result)
    }

    @Test
    fun `Second Case`() {
        val result = numberOfWays.numOfWays(5000)
        assertEquals(30228214, result)
    }
}