package cote.leet.from2001to3000

import org.example.cote.NumberOfLaserBeamsInBank
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class NumberOfLaserBeamsInBankTest {
    private val numberOfLaserBeamsInBank = NumberOfLaserBeamsInBank()

    @Test
    fun `First Case`() {
        val bank = arrayOf("011001","000000","010100","001000")
        val result = numberOfLaserBeamsInBank.numberOfBeams(bank)
        assertEquals(8, result)
    }

    @Test
    fun `Second Case`() {
        val bank = arrayOf("000","111","000")
        val result = numberOfLaserBeamsInBank.numberOfBeams(bank)
        assertEquals(0, result)
    }
}