package cote.leet.from2001to3000

import org.example.cote.greed.SmallestMissingNonNegativeIntegerAfterOperations
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SmallestMissingNonNegativeIntegerAfterOperationsTest {
    private val iao = SmallestMissingNonNegativeIntegerAfterOperations()

    @Test
    fun `First Case`() {
        val nums = intArrayOf(1,-10,7,13,6,8)
        val result = iao.findSmallestInteger(nums, 5)
        assertEquals(4, result)
    }

    @Test
    fun `Second Case`() {
        val nums = intArrayOf(1,-10,7,13,6,8)
        val result = iao.findSmallestInteger(nums, 7)
        assertEquals(2, result)
    }
}