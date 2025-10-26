package cote.leet.from3001to4000

import org.example.cote.dp.TakingMaximumEnergyFromTheMysticDungeon
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TakingMaximumEnergyFromTheMysticDungeonTest {
    private val mysticDungeon = TakingMaximumEnergyFromTheMysticDungeon()

    @Test
    fun `First Case`() {
        val energy = intArrayOf(5,2,-10,-5,1)
        val result = mysticDungeon.maximumEnergy(energy, 3)
        assertEquals(3, result)
    }

    @Test
    fun `Second Case`() {
        val energy = intArrayOf(-2,-3,-1)
        val result = mysticDungeon.maximumEnergy(energy, 2)
        assertEquals(-1, result)
    }
}