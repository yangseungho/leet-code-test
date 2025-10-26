package cote.leet.from1to1000

import org.example.cote.dfs.CombinationSum
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class CombinationSumTest {
    private val combination = CombinationSum()

    @Test
    fun `First Case`() {
        val candidates = intArrayOf(2,3,6,7)
        val result = combination.combinationSum(candidates, 7)
        assertContentEquals(listOf(
            listOf(2,2,3),
            listOf(7),
        ), result)
    }

    @Test
    fun `Second Case`() {
        val candidates = intArrayOf(2,3,5)
        val result = combination.combinationSum(candidates, 8)
        assertContentEquals(listOf(
            listOf(2,2,2,2),
            listOf(2,3,3),
            listOf(3,5),
        ), result)
    }

    @Test
    fun `Third Case`() {
        val candidates = intArrayOf(2)
        val result = combination.combinationSum(candidates, 1)
        assertContentEquals(listOf(), result)
    }

}