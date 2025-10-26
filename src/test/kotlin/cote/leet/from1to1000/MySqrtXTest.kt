package cote.leet.from1to1000

import org.example.cote.binarysearch.MySqrtX
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MySqrtXTest {
    private val mySqrtX = MySqrtX()

    @Test
    fun `First Case`() {
        val result = mySqrtX.mySqrt(4)
        assertEquals(2, result)
    }

    @Test
    fun `Second Case`() {
        val result = mySqrtX.mySqrt(8)
        assertEquals(2, result)
    }

    @Test
    fun `Third Case`() {
        val result = mySqrtX.mySqrt(2147483647)
        assertEquals(46340, result)
    }
}