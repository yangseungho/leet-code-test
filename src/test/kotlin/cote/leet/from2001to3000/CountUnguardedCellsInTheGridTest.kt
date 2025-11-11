package cote.leet.from2001to3000

import org.example.cote.CountUnguardedCellsInTheGrid
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CountUnguardedCellsInTheGridTest {
    private val cells = CountUnguardedCellsInTheGrid()

    @Test
    fun `First Case`() {
        val guards = arrayOf(
            intArrayOf(0, 0),
            intArrayOf(1, 1),
            intArrayOf(2, 3),
        )
        val walls = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(2, 2),
            intArrayOf(1, 4),
        )
        val result = cells.countUnguarded(4,6, guards, walls)
        assertEquals(7, result)
    }

    @Test
    fun `Second Case`() {
        val guards = arrayOf(
            intArrayOf(1, 1),
        )
        val walls = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(1, 0),
            intArrayOf(2, 1),
            intArrayOf(1, 2),
        )
        val result = cells.countUnguarded(3,3, guards, walls)
        assertEquals(4, result)
    }
}