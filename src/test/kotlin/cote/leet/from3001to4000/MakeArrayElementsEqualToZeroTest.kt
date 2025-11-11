package cote.leet.from3001to4000

import org.example.cote.simulation.MakeArrayElementsEqualToZero
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MakeArrayElementsEqualToZeroTest {
    private val makeArrayElementsEqualToZero = MakeArrayElementsEqualToZero()
    @Test
    fun `First Case`() {
        val nums = intArrayOf(1,0,2,0,3)
        val result = makeArrayElementsEqualToZero.countValidSelections(nums)
        assertEquals(2, result)
    }

    @Test
    fun `Second Case`() {
        val nums = intArrayOf(2,3,4,0,4,1,0)
        val result = makeArrayElementsEqualToZero.countValidSelections(nums)
        assertEquals(0, result)
    }
}