package cote

import org.example.cote.greed.WiggleSubsequence
import org.example.cote.simulation.PlusOne
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class WiggleSubsequenceTest {
    private val wiggle = WiggleSubsequence()

    @Test
    fun `First Case`() {
        val nums = intArrayOf(1,7,4,9,2,5)
        val result = wiggle.wiggleMaxLength(nums)
        assertEquals(6, result)
    }

    @Test
    fun `Second Case`() {
        val nums = intArrayOf(1,17,5,10,13,15,10,5,16,8)
        val result = wiggle.wiggleMaxLength(nums)
        assertEquals(7, result)
    }

    @Test
    fun `Third Case`() {
        val nums = intArrayOf(1,2,3,4,5,6,7,8,9)
        val result = wiggle.wiggleMaxLength(nums)
        assertEquals(2, result)
    }
}