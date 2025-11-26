package cote.leet.from1to1000

import org.example.cote.dp.OnesAndZeroes
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class OnesAndZeroesTest {
    private val onesAndZeroes = OnesAndZeroes()

    @Test
    fun `First Case`() {
        val strs = arrayOf("10","0001","111001","1","0")
        val result = onesAndZeroes.findMaxForm(strs, 5, 3)
        assertEquals(4, result)
    }

    @Test
    fun `Second Case`() {
        val strs = arrayOf("10","0","1")
        val result = onesAndZeroes.findMaxForm(strs, 1, 1)
        assertEquals(2, result)
    }
}