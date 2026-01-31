package cote.leet.from2001to3000

import org.example.cote.etc.noalgorithm.KeepMultiplyingFoundValuesByTwo
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class KeepMultiplyingFoundValuesByTwoTest {
    private val keepMulti = KeepMultiplyingFoundValuesByTwo()

    @Test
    fun `First Case`() {
        val nums = intArrayOf(5,3,6,1,12)
        val result = keepMulti.findFinalValue(nums, 3)
        assertEquals(24, result)
    }

    @Test
    fun `Second Case`() {
        val nums = intArrayOf(2,7,9)
        val result = keepMulti.findFinalValue(nums, 4)
        assertEquals(4, result)
    }
}