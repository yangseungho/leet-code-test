package cote.leet.from3001to4000

import org.example.cote.greed.FindMinimumOperationsToMakeAllElementsDivisibleByThree
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindMinimumOperationsToMakeAllElementsDivisibleByThreeTest {
    private val minimum =
        FindMinimumOperationsToMakeAllElementsDivisibleByThree()

    @Test
    fun `First Case`() {
        val nums = intArrayOf(1,2,3,4)
        val result = minimum.minimumOperations(nums)
        kotlin.test.assertEquals(3, result)
    }

    @Test
    fun `Second Case`() {
        val nums = intArrayOf(3,6,9)
        val result = minimum.minimumOperations(nums)
        kotlin.test.assertEquals(0, result)
    }
}