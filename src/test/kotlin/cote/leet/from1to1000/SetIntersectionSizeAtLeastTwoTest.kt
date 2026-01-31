package cote.leet.from1to1000

import org.example.cote.greed.SetIntersectionSizeAtLeastTwo
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SetIntersectionSizeAtLeastTwoTest {
    private val intersectionSizeAtLeastTwo = SetIntersectionSizeAtLeastTwo()

    @Test
    fun `First Case`() {
        val intervals = arrayOf(
            intArrayOf(1,3),
            intArrayOf(3,7),
            intArrayOf(8,9),
        )
        val result = intersectionSizeAtLeastTwo.intersectionSizeTwo(intervals)
        assertEquals(5, result)
    }

    @Test
    fun `Second Case`() {
        val intervals = arrayOf(
            intArrayOf(1,3),
            intArrayOf(1,4),
            intArrayOf(2,5),
            intArrayOf(3,5),
        )
        val result = intersectionSizeAtLeastTwo.intersectionSizeTwo(intervals)
        assertEquals(3, result)
    }

    @Test
    fun `Third Case`() {
        val intervals = arrayOf(
            intArrayOf(1,2),
            intArrayOf(2,3),
            intArrayOf(2,4),
            intArrayOf(4,5),
        )
        val result = intersectionSizeAtLeastTwo.intersectionSizeTwo(intervals)
        assertEquals(5, result)
    }
}