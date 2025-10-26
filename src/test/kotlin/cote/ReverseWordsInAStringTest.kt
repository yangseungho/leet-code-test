package cote

import org.example.cote.string.ReverseWordsInAString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReverseWordsInAStringTest {
    private val reverseWords = ReverseWordsInAString()

    @Test
    fun `First Case`() {
        val word = "the sky is blue"
        val result = reverseWords.reverseWords(word)
        assertEquals("blue is sky the", result)
    }

    @Test
    fun `Second Case`() {
        val word = "  hello world  "
        val result = reverseWords.reverseWords(word)
        assertEquals("world hello", result)
    }

    @Test
    fun `Third Case`() {
        val word = "a good   example"
        val result = reverseWords.reverseWords(word)
        assertEquals("example good a", result)
    }
}