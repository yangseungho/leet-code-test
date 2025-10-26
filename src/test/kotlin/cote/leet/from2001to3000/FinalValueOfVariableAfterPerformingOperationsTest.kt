package cote.leet.from2001to3000

import org.example.cote.simulation.FinalValueOfVariableAfterPerformingOperations
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FinalValueOfVariableAfterPerformingOperationsTest {
    private val finalValue = FinalValueOfVariableAfterPerformingOperations()

    @Test
    fun `First Case`() {
        val operations = arrayOf("--X","X++","X++")
        val result = finalValue.finalValueAfterOperations(operations)
        assertEquals(1, result)
    }

    @Test
    fun `Second Case`() {
        val operations = arrayOf("++X","++X","X++")
        val result = finalValue.finalValueAfterOperations(operations)
        assertEquals(3, result)
    }

    @Test
    fun `Third Case`() {
        val operations = arrayOf("X++","++X","--X","X--")
        val result = finalValue.finalValueAfterOperations(operations)
        assertEquals(0, result)
    }
}