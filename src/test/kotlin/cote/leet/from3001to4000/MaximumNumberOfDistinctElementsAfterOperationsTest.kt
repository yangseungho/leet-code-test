package cote.leet.from3001to4000

import org.example.cote.greed.MaximumNumberOfDistinctElementsAfterOperations
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MaximumNumberOfDistinctElementsAfterOperationsTest {
    private val distinctElements = MaximumNumberOfDistinctElementsAfterOperations()

    @Test
    fun `First Case`() {
        val nums = intArrayOf(1,2,2,3,3,4)
        val result = distinctElements.maxDistinctElements(nums, 2)
        assertEquals(6, result)
    }

    @Test
    fun `Second Case`() {
        val nums = intArrayOf(4,4,4,4)
        val result = distinctElements.maxDistinctElements(nums, 1)
        assertEquals(3, result)
    }

    @Test
    fun `Third Case`() {
        val nums = intArrayOf(1,1,1,1,1,1,1,1,5,5,5)
        val result = distinctElements.maxDistinctElements(nums, 3)
        assertEquals(10, result)
    }
}