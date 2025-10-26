package cote.leet.from1to1000

import org.example.cote.twopoint.LongestSubstringWithoutRepeatingCharacters
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LongestSubstringWithoutRepeatingCharactersTest {
    private val longestSubstring = LongestSubstringWithoutRepeatingCharacters()

    @Test
    fun `First Case`() {
        val result = longestSubstring.lengthOfLongestSubstring("abcabcbb")
        assertEquals(3, result)
    }

    @Test
    fun `Second Case`() {
        val result = longestSubstring.lengthOfLongestSubstring("bbbbb")
        assertEquals(1, result)
    }

    @Test
    fun `Third Case`() {
        val result = longestSubstring.lengthOfLongestSubstring("pwwkew")
        assertEquals(3, result)
    }
}