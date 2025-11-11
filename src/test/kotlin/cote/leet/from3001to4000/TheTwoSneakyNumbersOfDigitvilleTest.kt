package cote.leet.from3001to4000

import org.example.cote.simulation.TheTwoSneakyNumbersOfDigitville
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class TheTwoSneakyNumbersOfDigitvilleTest {
    private val sneaky = TheTwoSneakyNumbersOfDigitville()

    @Test
    fun `First Case`() {
        val nums = intArrayOf(0,1,1,0)
        val result = sneaky.getSneakyNumbers(nums)
        assertContentEquals(intArrayOf(0, 1), result)
    }

    @Test
    fun `Second Case`() {
        val nums = intArrayOf(0,3,2,1,3,2)
        val result = sneaky.getSneakyNumbers(nums)
        assertContentEquals(intArrayOf(2, 3), result)
    }

    @Test
    fun `Third Case`() {
        val nums = intArrayOf(7,1,5,4,3,4,6,0,9,5,8,2)
        val result = sneaky.getSneakyNumbers(nums)
        assertContentEquals(intArrayOf(4, 5), result)
    }
}