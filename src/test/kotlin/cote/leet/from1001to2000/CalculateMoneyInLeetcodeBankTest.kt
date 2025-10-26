package cote.leet.from1001to2000

import org.example.cote.etc.noalgorithm.CalculateMoneyInLeetcodeBank
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class CalculateMoneyInLeetcodeBankTest {
    private val calculateMoney = CalculateMoneyInLeetcodeBank()

    @Test
    fun `First Case`() {
        val result = calculateMoney.totalMoney(4)
        assertEquals(10, result)
    }

    @Test
    fun `Second Case`() {
        val result = calculateMoney.totalMoney(10)
        assertEquals(37, result)
    }

    @Test
    fun `Third Case`() {
        val result = calculateMoney.totalMoney(20)
        assertEquals(96, result)
    }

    @Test
    fun `Edge Case`() {
        val result = calculateMoney.totalMoney(1)
        assertEquals(1, result)
    }
}