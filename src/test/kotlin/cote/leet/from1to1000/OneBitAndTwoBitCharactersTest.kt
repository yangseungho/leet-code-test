package cote.leet.from1to1000

import org.example.cote.etc.noalgorithm.OneBitAndTwoBitCharacters
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class OneBitAndTwoBitCharactersTest {
    private val oneTwoBit = OneBitAndTwoBitCharacters()

    @Test
    fun `First Case`() {
        val bits = intArrayOf(1,0,0)
        val result = oneTwoBit.isOneBitCharacter(bits)
        assertEquals(true, result)
    }

    @Test
    fun `Second Case`() {
        val bits = intArrayOf(1,1,1,0)
        val result = oneTwoBit.isOneBitCharacter(bits)
        assertEquals(false, result)
    }

}