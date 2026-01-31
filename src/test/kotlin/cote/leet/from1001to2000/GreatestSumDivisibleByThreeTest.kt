package cote.leet.from1001to2000

import org.example.cote.greed.GreatestSumDivisibleByThree
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class GreatestSumDivisibleByThreeTest {
    private val greatestSum = GreatestSumDivisibleByThree()

    @Test
    fun `First Case`() {
        val nums = intArrayOf(3,6,5,1,8)
        val result = greatestSum.maxSumDivThree(nums)
        assertEquals(18, result)
    }

    @Test
    fun `Second Case`() {
        val nums = intArrayOf(4)
        val result = greatestSum.maxSumDivThree(nums)
        assertEquals(0, result)
    }

    @Test
    fun `Third Case`() {
        val nums = intArrayOf(1,2,3,4,4)
        val result = greatestSum.maxSumDivThree(nums)
        assertEquals(12, result)
    }
}