package cote

import org.example.cote.dfs.Permutation
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class PermutationTest {
    val permutation = Permutation()
    @Test
    fun `First Case`() {
        val testCase = intArrayOf(1,2,3)
        val result = permutation.permute(testCase)
        assertContentEquals(listOf(
            listOf(1,2,3),
            listOf(1,3,2),
            listOf(2,1,3),
            listOf(2,3,1),
            listOf(3,1,2),
            listOf(3,2,1),
        ), result)
    }
}