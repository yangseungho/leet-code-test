package cote.leet.from3001to4000

import org.example.cote.twopoint.MaximumFrequencyOfAnElementAfterPerformingOperationsI
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MaximumFrequencyOfAnElementAfterPerformingOperationsITest {
    private val maximum = MaximumFrequencyOfAnElementAfterPerformingOperationsI()

    @Test
    fun `First Case`() {
        val nums = intArrayOf(1,5,2,4)
        val result = maximum.maxFrequency(nums, 1, 2)
        assertEquals(2, result)
    }

    @Test
    fun `Second Case`() {
        val nums = intArrayOf(5,11,20,20)
        val result = maximum.maxFrequency(nums, 5, 1)
        assertEquals(2, result)
    }
}