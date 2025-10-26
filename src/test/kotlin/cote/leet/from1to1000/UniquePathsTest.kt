package cote.leet.from1to1000

import org.example.cote.dp.UniquePaths
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class UniquePathsTest {
    private val uniquePaths = UniquePaths()

    @Test
    fun `First Case`() {
        val result = uniquePaths.uniquePaths(3, 7)
        assertEquals(28, result)
    }

    @Test
    fun `Second Case`() {
        val result = uniquePaths.uniquePaths(3, 2)
        assertEquals(3, result)
    }
}