package cote

import org.example.cote.dfs.PacificAtlanticWaterFlow
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class PacificAtlanticWaterFlowTest {
    private val waterFlow = PacificAtlanticWaterFlow()

    @Test
    fun `First Case`() {
        val heights = arrayOf(
            intArrayOf(1,2,2,3,5),
            intArrayOf(3,2,3,4,4),
            intArrayOf(2,4,5,3,1),
            intArrayOf(6,7,1,4,5),
            intArrayOf(5,1,1,2,4),
        )
        val result = waterFlow.pacificAtlantic(heights)
        assertContentEquals(listOf(
            listOf(0,4),
            listOf(1,3),
            listOf(1,4),
            listOf(2,2),
            listOf(3,0),
            listOf(3,1),
            listOf(4,0),
        ), result)
    }

    @Test
    fun `Second Case`() {
        val heights = arrayOf(
            intArrayOf(1)
        )
        val result = waterFlow.pacificAtlantic(heights)
        assertContentEquals(listOf(
            listOf(0,0),
        ), result)
    }
}