package cote.leet.from2001to3000

import org.example.cote.math.CountOperationsToObtainZero
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CountOperationsToObtainZeroTest {
    private val countOper = CountOperationsToObtainZero()
    @Test
    fun `First Case`() {
        val result = countOper.countOperations(2, 3)
        assertEquals(3, result)
    }

    @Test
    fun `Second Case`() {
        val result = countOper.countOperations(10, 10)
        assertEquals(1, result)
    }
}