package cote.leet.from1001to2000

import org.example.cote.greed.ConstructKPalindromeStrings
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ConstructKPalindromeStringsTest {
    private val palindrome = ConstructKPalindromeStrings()

    @Test
    fun `First Case`() {
        val result = palindrome.canConstruct("annabelle", 2)
        assertTrue(result)
    }

    @Test
    fun `Second Case`() {
        val result = palindrome.canConstruct("leetcode", 3)
        assertFalse(result)
    }

    @Test
    fun `Third Case`() {
        val result = palindrome.canConstruct("true", 4)
        assertTrue(result)
    }
}