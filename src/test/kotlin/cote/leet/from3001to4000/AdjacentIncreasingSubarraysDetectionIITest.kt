package cote.leet.from3001to4000

import org.example.cote.binarysearch.AdjacentIncreasingSubarraysDetectionII
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AdjacentIncreasingSubarraysDetectionIITest {
    private val subarraysDetectionII = AdjacentIncreasingSubarraysDetectionII()

    @Test
    fun `First Case`() {
        val nums = mutableListOf<Int>(2,5,7,8,9,2,3,4,3,1)
        val result = subarraysDetectionII.maxIncreasingSubarrays(nums)
        assertEquals(3, result)
    }

    @Test
    fun `Second Case`() {
        val nums = mutableListOf<Int>(1,2,3,4,4,4,4,5,6,7)
        val result = subarraysDetectionII.maxIncreasingSubarrays(nums)
        assertEquals(2, result)
    }
}