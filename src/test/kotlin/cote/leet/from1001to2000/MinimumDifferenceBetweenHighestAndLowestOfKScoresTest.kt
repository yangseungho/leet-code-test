package cote.leet.from1001to2000

import org.example.cote.twopointSlidingWindow.MinimumDifferenceBetweenHighestAndLowestOfKScores
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MinimumDifferenceBetweenHighestAndLowestOfKScoresTest {
    private val mdbKScores = MinimumDifferenceBetweenHighestAndLowestOfKScores()

    @Test
    fun `First Case`() {
        val nums = intArrayOf(90)
        val result = mdbKScores.minimumDifference(nums, 1)
        assertEquals(0, result)
    }

    @Test
    fun `Second Case`() {
        val nums = intArrayOf(9,4,1,7)
        val result = mdbKScores.minimumDifference(nums, 2)
        assertEquals(2, result)
    }
}