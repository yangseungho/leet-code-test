package cote

import org.example.cote.string.CountAndSay
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class CountAndSayTest {
    private val countAndSay = CountAndSay()

    @Test
    fun `First Case`() {
        val result = countAndSay.countAndSay(4)
        assertEquals("1211", result)
    }

    @Test
    fun `Second Case`() {
        val result = countAndSay.countAndSay(1)
        assertEquals("1", result)
    }
}