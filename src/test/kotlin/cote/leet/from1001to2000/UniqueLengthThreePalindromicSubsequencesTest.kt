package cote.leet.from1001to2000

import org.example.cote.prefix.UniqueLengthThreePalindromicSubsequences
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class UniqueLengthThreePalindromicSubsequencesTest {
    private val uniqueLengthPalindromic = UniqueLengthThreePalindromicSubsequences()

    @Test
    fun `First Case`() {
        val s = "aabca"
        val result = uniqueLengthPalindromic.countPalindromicSubsequence(s)
        assertEquals(3, result)
    }

    @Test
    fun `Second Case`() {
        val s = "adc"
        val result = uniqueLengthPalindromic.countPalindromicSubsequence(s)
        assertEquals(0, result)
    }

    @Test
    fun `Third Case`() {
        val s = "bbcbaba"
        val result = uniqueLengthPalindromic.countPalindromicSubsequence(s)
        assertEquals(4, result)
    }
}