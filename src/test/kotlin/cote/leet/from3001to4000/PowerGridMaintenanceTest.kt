package cote.leet.from3001to4000

import org.example.cote.graph.unionfind.PowerGridMaintenance
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class PowerGridMaintenanceTest {
    private val powerGrid = PowerGridMaintenance()

    @Test
    fun `First Case`() {
        val connections = arrayOf(
            intArrayOf(1,2),
            intArrayOf(2,3),
            intArrayOf(3,4),
            intArrayOf(4,5)
        )
        val queries = arrayOf(
            intArrayOf(1,3),
            intArrayOf(2,1),
            intArrayOf(1,1),
            intArrayOf(2,2),
            intArrayOf(1,2)
        )
        val result = powerGrid.processQueries(5, connections, queries)
        assertContentEquals(intArrayOf(3,2,3), result)
    }

    @Test
    fun `Second Case`() {
        val connections = emptyArray<IntArray>()
        val queries = arrayOf(
            intArrayOf(1,1),
            intArrayOf(2,1),
            intArrayOf(1,1)
        )
        val result = powerGrid.processQueries(5, connections, queries)
        assertContentEquals(intArrayOf(1,-1), result)
    }
}