package cote.leet.from3001to4000

import org.example.cote.dp.MaximumTotalDamageWithSpellCasting
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

// https://leetcode.com/problems/maximum-total-damage-with-spell-casting

class MaximumTotalDamageWithSpellCastingTest {
    private val spellCasting = MaximumTotalDamageWithSpellCasting()

    @Test
    fun `First Case`() {
        val power = intArrayOf(1,1,3,4)
        val result = spellCasting.maximumTotalDamage(power)
        assertEquals(6, result)
    }

    @Test
    fun `Second Case`() {
        val power = intArrayOf(7,1,6,6)
        val result = spellCasting.maximumTotalDamage(power)
        assertEquals(13, result)
    }

}