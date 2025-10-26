package cote

import cote.binarysearch.SuccessfulPairsOfSpellsAndPotions
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class SuccessfulPairsOfSpellsAndPotionsTest {
    private val successful = SuccessfulPairsOfSpellsAndPotions()

    @Test
    fun `First Case`() {
        val spells = intArrayOf(5,1,3)
        val potions = intArrayOf(1,2,3,4,5)
        val result = successful.successfulPairs(spells, potions, 7)
        assertContentEquals(intArrayOf(4,0,3), result)
    }

    @Test
    fun `Second Case`() {
        val spells = intArrayOf(3,1,2)
        val potions = intArrayOf(8,5,8)
        val result = successful.successfulPairs(spells, potions, 16)
        assertContentEquals(intArrayOf(2,0,2), result)
    }
}