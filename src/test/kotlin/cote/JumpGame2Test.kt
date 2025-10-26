package cote

import org.example.cote.greed.JumpGame2
import org.example.cote.simulation.PlusOne
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class JumpGame2Test {
    private val jump = JumpGame2()

    @Test
    fun `First Case`() {
        val nums = intArrayOf(2,3,1,1,4)
        val result = jump.jump(nums)
        assertEquals(2, result)
    }

    @Test
    fun `Second Case`() {
        val nums = intArrayOf(2,3,0,1,4)
        val result = jump.jump(nums)
        assertEquals(2, result)
    }
}