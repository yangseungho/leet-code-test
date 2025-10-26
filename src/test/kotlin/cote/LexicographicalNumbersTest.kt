package cote

import org.example.cote.dfs.LexicographicalNumbers
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class LexicographicalNumbersTest {
    private val lexicographicalNumbers = LexicographicalNumbers()
    @Test
    fun `First Case`() {
        val result = lexicographicalNumbers.lexicalOrder(13)
        assertContentEquals(listOf(1,10,11,12,13,2,3,4,5,6,7,8,9), result)
    }

    @Test
    fun `Second Case`() {
        val result = lexicographicalNumbers.lexicalOrder(2)
        assertContentEquals(listOf(1,2), result)
    }
}