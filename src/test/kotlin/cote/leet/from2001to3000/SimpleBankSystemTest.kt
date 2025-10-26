package cote.leet.from2001to3000

import org.example.cote.etc.noalgorithm.SimpleBankSystem
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class SimpleBankSystemTest {
    private val balance = longArrayOf(10, 100, 20, 50, 30)
    private val simpleBank = SimpleBankSystem(balance)

    @Test
    fun `test Case`() {
        val result1 = simpleBank.withdraw(3, 10)
        assertTrue(result1)

        val result2 = simpleBank.transfer(5, 1, 20)
        assertTrue(result2)

        val result3 = simpleBank.deposit(5,  20)
        assertTrue(result3)

        val result4 = simpleBank.transfer(3, 4, 15)
        assertFalse(result4)

        val result5 = simpleBank.withdraw(10, 50)
        assertFalse(result5)
    }
}