package cote.leet.from1001to2000

import org.example.cote.prefix.LargestMagicSquare
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LargestMagicSquareTest {
    private val magicSquare = LargestMagicSquare()

    @Test
    fun `First Case`() {
        val grid = arrayOf(
            intArrayOf(7,1,4,5,6),
            intArrayOf(2,5,1,6,4),
            intArrayOf(1,5,4,3,2),
            intArrayOf(1,2,7,3,4)
        )
        val result = magicSquare.largestMagicSquare(grid)
        assertEquals(3, result)
    }

    @Test
    fun `Second Case`() {
        val grid = arrayOf(
            intArrayOf(5,1,3,1),
            intArrayOf(9,3,3,1),
            intArrayOf(1,3,3,8),
        )
        val result = magicSquare.largestMagicSquare(grid)
        assertEquals(2, result)
    }

}