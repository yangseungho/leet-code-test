package cote

import org.example.cote.twopoint.FourSum
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals


class FourSumTest {
    private val fourSum = FourSum()

    @Test
    fun `First Case`() {
        val testCase = intArrayOf(1,0,-1,0,-2,2)
        val result = fourSum.fourSum(testCase, 0)
        assertContentEquals(listOf(
            listOf(-2,-1,1,2),
            listOf(-2,0,0,2),
            listOf(-1,0,0,1),
        ), result)
    }

    @Test
    fun `Second Case`() {
        val testCase = intArrayOf(2,2,2,2,2)
        val result = fourSum.fourSum(testCase, 8)
        assertContentEquals(listOf(
            listOf(2,2,2,2),
        ), result)
    }
}