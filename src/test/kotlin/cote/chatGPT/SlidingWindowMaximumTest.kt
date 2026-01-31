package cote.chatGPT

import org.example.cote.chatGPT.SlidingWindowMaximum
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class SlidingWindowMaximumTest {
    private val sliding = SlidingWindowMaximum()

    @Test
    fun `First Case`() {
        val window = intArrayOf(1,3,-1,-3,5,3,6,7)
        val result = sliding.maxSlidingWindow(window, 3)
        assertContentEquals(intArrayOf(3,3,5,5,6,7), result)
    }

    @Test
    fun `Second Case`() {
        val window = intArrayOf(9, 3, 1, -1, 5)
        val result = sliding.maxSlidingWindow(window, 2)
        assertContentEquals(intArrayOf(9, 3, 1, 5), result)
    }
}