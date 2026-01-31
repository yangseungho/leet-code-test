package cote.leet.from3001to4000

import org.example.cote.graph.priorityQueue.MinimumCostPathWithEdgeReversals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MinimumCostPathWithEdgeReversalsTest {
    private val mcpw = MinimumCostPathWithEdgeReversals()

    @Test
    fun `First Case`() {
        val edges = arrayOf(
            intArrayOf(0,1,3),
            intArrayOf(3,1,1),
            intArrayOf(2,3,4),
            intArrayOf(0,2,2)
        )
        val result = mcpw.minCost(4, edges)
        assertEquals(5, result)
    }

    @Test
    fun `Second Case`() {
        val edges = arrayOf(
            intArrayOf(0,2,1),
            intArrayOf(2,1,1),
            intArrayOf(1,3,1),
            intArrayOf(2,3,3)
        )
        val result = mcpw.minCost(4, edges)
        assertEquals(3, result)
    }
}