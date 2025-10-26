package cote.leet.from3001to4000

import org.example.cote.dp.FindSumOfArrayProductOfMagicalSequences
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FindSumOfArrayProductOfMagicalSequencesTest {
    private val sequences = FindSumOfArrayProductOfMagicalSequences()
    @Test
    fun `First Case`() {
        val nums = intArrayOf(1,10,100,10000,1000000)
        val result = sequences.magicalSum(5, 5, nums)
        assertEquals(991600007, result)
    }

    @Test
    fun `Second Case`() {
        val nums = intArrayOf(5,4,3,2,1)
        val result = sequences.magicalSum(2, 2, nums)
        assertEquals(170, result)
    }

    @Test
    fun `Third Case`() {
        val nums = intArrayOf(28)
        val result = sequences.magicalSum(1, 1, nums)
        assertEquals(28, result)
    }
}