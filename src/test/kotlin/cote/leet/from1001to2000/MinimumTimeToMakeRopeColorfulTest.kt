package cote.leet.from1001to2000

import org.example.cote.greed.MinimumTimeToMakeRopeColorful
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MinimumTimeToMakeRopeColorfulTest {
    private val colorful = MinimumTimeToMakeRopeColorful()

    @Test
    fun `First Case`() {
        val colors = "abaac"
        val result = colorful.minCost(colors, intArrayOf(1,2,3,4,5))
        assertEquals(3, result)
    }

    @Test
    fun `Second Case`() {
        val colors = "abc"
        val result = colorful.minCost(colors, intArrayOf(1,2,3))
        assertEquals(0, result)
    }

    @Test
    fun `Third Case`() {
        val colors = "aabaa"
        val result = colorful.minCost(colors, intArrayOf(1,2,3,4,1))
        assertEquals(2, result)
    }
}