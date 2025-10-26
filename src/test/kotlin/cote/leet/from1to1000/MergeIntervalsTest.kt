package cote.leet.from1to1000

import org.example.cote.greed.MergeIntervals
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class MergeIntervalsTest {
    private val mergeIntervals = MergeIntervals()

    @Test
    fun `First Case`() {
        val intervals = arrayOf(
            intArrayOf(1,3),
            intArrayOf(2,6),
            intArrayOf(8,10),
            intArrayOf(15,18),
        )
        val result = mergeIntervals.merge(intervals)
        assertArrayEquals(arrayOf(
            intArrayOf(1,6),
            intArrayOf(8,10),
            intArrayOf(15,18),
        ), result)
    }

    @Test
    fun `Second Case`() {
        val intervals = arrayOf(
            intArrayOf(1,4),
            intArrayOf(4,5),
        )
        val result = mergeIntervals.merge(intervals)
        assertArrayEquals(arrayOf(
            intArrayOf(1,5),
        ), result)
    }

    @Test
    fun `Third Case`() {
        val intervals = arrayOf(
            intArrayOf(4,7),
            intArrayOf(1,4),
        )
        val result = mergeIntervals.merge(intervals)
        assertArrayEquals(arrayOf(
            intArrayOf(1,7),
        ), result)
    }
}