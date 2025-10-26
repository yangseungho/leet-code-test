package cote.leet.from1to1000

import org.example.cote.hash.LetterCombinationsOfAPhoneNumber
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class LetterCombinationsOfAPhoneNumberTest {
    private val phoneNumber = LetterCombinationsOfAPhoneNumber()
    @Test
    fun `First Case`() {
        val result = phoneNumber.letterCombinations("23")
        assertContentEquals(listOf("ad","ae","af","bd","be","bf","cd","ce","cf"), result)
    }

    @Test
    fun `Second Case`() {
        val result = phoneNumber.letterCombinations("")
        assertContentEquals(listOf(), result)
    }

    @Test
    fun `Third Case`() {
        val result = phoneNumber.letterCombinations("2")
        assertContentEquals(listOf("a","b","c"), result)
    }
}