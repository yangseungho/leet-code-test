package cote.leet.from3001to4000

import org.example.cote.twopoint.FindXSumOfAllKLongSubarraysI
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class FindXSumOfAllKLongSubarraysITest {
    private val kLong = FindXSumOfAllKLongSubarraysI()
    @Test
    fun `First Case`() {
        val nums = intArrayOf(1,1,2,2,3,4,2,3)
        val result = kLong.findXSum(nums, 6, 2)
        assertContentEquals(intArrayOf(6,10,12), result)
    }

    @Test
    fun `Second Case`() {
        val nums = intArrayOf(3,8,7,8,7,5)
        val result = kLong.findXSum(nums, 2, 2)
        assertContentEquals(intArrayOf(11,15,15,15,12), result)
    }
}