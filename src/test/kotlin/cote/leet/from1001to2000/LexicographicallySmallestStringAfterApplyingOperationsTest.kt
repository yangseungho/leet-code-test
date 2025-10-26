package cote.leet.from1001to2000

import org.example.cote.bfs.LexicographicallySmallestStringAfterApplyingOperations
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LexicographicallySmallestStringAfterApplyingOperationsTest {
    private val lexi = LexicographicallySmallestStringAfterApplyingOperations()

    @Test
    fun `First Case`() {
        val s = "5525"
        val result = lexi.findLexSmallestString(s, 9, 2)
        assertEquals("2050", result)
    }

    @Test
    fun `Second Case`() {
        val s = "74"
        val result = lexi.findLexSmallestString(s, 5, 1)
        assertEquals("24", result)
    }

    @Test
    fun `Third Case`() {
        val s = "0011"
        val result = lexi.findLexSmallestString(s, 4, 2)
        assertEquals("0011", result)
    }
}