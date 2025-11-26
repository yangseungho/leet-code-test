package cote.leet.from3001to4000

import org.example.cote.greed.MinimumOperationsToConvertAllElementsToZero
import org.example.cote.etc.bit.SmallestNumberWithAllSetBits
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MinimumOperationsToConvertAllElementsToZeroTest {
    private val minimumOper = MinimumOperationsToConvertAllElementsToZero()

    @Test
    fun `First Case`() {
        val nums = intArrayOf(0, 2)
        val result = minimumOper.minOperations(nums)
        assertEquals(1, result)
    }

    @Test
    fun `Second Case`() {
        val nums = intArrayOf(3,1,2,1)
        val result = minimumOper.minOperations(nums)
        assertEquals(3, result)
    }

    @Test
    fun `Third Case`() {
        val nums = intArrayOf(1,2,1,2,1,2)
        val result = minimumOper.minOperations(nums)
        assertEquals(4, result)
    }
}