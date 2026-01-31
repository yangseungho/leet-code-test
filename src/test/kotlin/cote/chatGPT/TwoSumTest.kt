package cote.chatGPT

import org.example.cote.chatGPT.TwoSum
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class TwoSumTest {
    private val twoSum = TwoSum()

    @Test
    fun `First Case`() {
        val result = twoSum.twoSum(intArrayOf(3,2,4), 6)
        assertContentEquals(intArrayOf(1, 2), result)
    }

    @Test
    fun `Second Case`() {
        val result = twoSum.twoSum(intArrayOf(2,7,11,15), 9)
        assertContentEquals(intArrayOf(0, 1), result)
    }
}