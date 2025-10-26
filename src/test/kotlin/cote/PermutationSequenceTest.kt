package cote

import org.example.cote.combinatorics.PermutationSequence
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PermutationSequenceTest {
    private val permutationSequence = PermutationSequence()

    @Test
    fun `First Case`() {
        val result = permutationSequence.getPermutation(3, 3)
        assertEquals("213", result)
    }

    @Test
    fun `Second Case`() {
        val result = permutationSequence.getPermutation(4, 9)
        assertEquals("2314", result)
    }

    @Test
    fun `Third Case`() {
        val result = permutationSequence.getPermutation(3, 1)
        assertEquals("123", result)
    }
}