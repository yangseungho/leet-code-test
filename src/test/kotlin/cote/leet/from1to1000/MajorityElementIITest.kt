package cote.leet.from1to1000

import org.example.cote.etc.boyermoore.MajorityElement2
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class MajorityElementIITest {
    private val majority = MajorityElement2()

    @Test
    fun `First Case`() {
        val nums = intArrayOf(3,2,3)
        val result = majority.majorityElement(nums)
        assertContentEquals(listOf(3), result)
    }

    @Test
    fun `Second Case`() {
        val nums = intArrayOf(1)
        val result = majority.majorityElement(nums)
        assertContentEquals(listOf(1), result)
    }

    @Test
    fun `Third Case`() {
        val nums = intArrayOf(1,2)
        val result = majority.majorityElement(nums)
        assertContentEquals(listOf(1,2), result)
    }
}