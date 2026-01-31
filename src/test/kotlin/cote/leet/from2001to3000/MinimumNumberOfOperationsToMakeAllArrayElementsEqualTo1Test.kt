package cote.leet.from2001to3000

import org.example.cote.math.MinimumNumberOfOperationsToMakeAllArrayElementsEqualTo1
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MinimumNumberOfOperationsToMakeAllArrayElementsEqualTo1Test {
    private val minimum = MinimumNumberOfOperationsToMakeAllArrayElementsEqualTo1()

    @Test
    fun `First Case`() {
        val nums = intArrayOf(2,6,3,4)
        val result = minimum.minOperations(nums)
        assertEquals(4, result)
    }

    @Test
    fun `Second Case`() {
        val nums = intArrayOf(2,10,6,14)
        val result = minimum.minOperations(nums)
        assertEquals(-1, result)
    }
}