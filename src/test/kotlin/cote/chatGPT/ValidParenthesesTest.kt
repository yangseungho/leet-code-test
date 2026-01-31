package cote.chatGPT

import org.example.cote.chatGPT.TwoSum
import org.example.cote.chatGPT.ValidParentheses
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class ValidParenthesesTest {
    private val validParentheses = ValidParentheses()

    @Test
    fun `First Case`() {
        val result = validParentheses.isValid("()[]{}")
        assertEquals(true, result)
    }

    @Test
    fun `Second Case`() {
        val result = validParentheses.isValid("(]")
        assertEquals(false, result)
    }
}