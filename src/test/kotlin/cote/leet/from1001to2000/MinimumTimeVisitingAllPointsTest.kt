package cote.leet.from1001to2000

import org.example.cote.array.MinimumTimeVisitingAllPoints
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MinimumTimeVisitingAllPointsTest {
    private val mtv = MinimumTimeVisitingAllPoints()

    @Test
    fun `First Case`() {
        val points = arrayOf(
            intArrayOf(1,1),
            intArrayOf(3,4),
            intArrayOf(-1,0),
        )
        val result = mtv.minTimeToVisitAllPoints(points)
        assertEquals(7, result)
    }

    @Test
    fun `Second Case`() {
        val points = arrayOf(
            intArrayOf(3,2),
            intArrayOf(-2,2),
        )
        val result = mtv.minTimeToVisitAllPoints(points)
        assertEquals(5, result)
    }
}