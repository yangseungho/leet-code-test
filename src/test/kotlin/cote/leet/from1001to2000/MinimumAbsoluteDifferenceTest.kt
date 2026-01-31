package cote.leet.from1001to2000

import org.example.cote.array.MinimumAbsoluteDifference
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MinimumAbsoluteDifferenceTest {
    private val mad = MinimumAbsoluteDifference()

    @Test
    fun `First Case`() {
        val arr = intArrayOf(4,2,1,3)
        val result = mad.minimumAbsDifference(arr)

        val expected = listOf(
            listOf(1, 2),
            listOf(2, 3),
            listOf(3, 4)
        )
        assertEquals(expected, result)
    }

    @Test
    fun `Second Case`() {
        val arr = intArrayOf(1,3,6,10,15)
        val result = mad.minimumAbsDifference(arr)

        val expected = listOf(
            listOf(1, 3),
        )
        assertEquals(expected, result)
    }

    @Test
    fun `Third Case`() {
        val arr = intArrayOf(3,8,-10,23,19,-4,-14,27)
        val result = mad.minimumAbsDifference(arr)

        val expected = listOf(
            listOf(-14, -10),
            listOf(19, 23),
            listOf(23, 27),
        )
        assertEquals(expected, result)
    }
}