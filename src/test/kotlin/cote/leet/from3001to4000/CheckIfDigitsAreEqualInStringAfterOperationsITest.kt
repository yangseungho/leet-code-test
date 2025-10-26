package cote.leet.from3001to4000

import org.example.cote.simulation.CheckIfDigitsAreEqualInStringAfterOperationsI
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class CheckIfDigitsAreEqualInStringAfterOperationsITest {
    private val afterOperations = CheckIfDigitsAreEqualInStringAfterOperationsI()

    @Test
    fun `First Case`() {
        val result = afterOperations.hasSameDigits("3902")
        assertTrue(result)
    }

    @Test
    fun `Second Case`() {
        val result = afterOperations.hasSameDigits("34789")
        assertFalse(result)
    }
}