package cote.leet.from3001to4000

import org.example.cote.dp.FindTheMinimumAmountOfTimeToBrewPotions
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FindTheMinimumAmountOfTimeToBrewPotionsTest {
    private val brewPotions = FindTheMinimumAmountOfTimeToBrewPotions()

    @Test
    fun `First Case`() {
        val skill = intArrayOf(1,5,2,4)
        val mana = intArrayOf(5,1,4,2)
        val result = brewPotions.minTime(skill, mana)
        assertEquals(110, result)
    }

    @Test
    fun `Second Case`() {
        val skill = intArrayOf(1,1,1)
        val mana = intArrayOf(1,1,1)
        val result = brewPotions.minTime(skill, mana)
        assertEquals(5, result)
    }

    @Test
    fun `Third Case`() {
        val skill = intArrayOf(1,2,3,4)
        val mana = intArrayOf(1,2)
        val result = brewPotions.minTime(skill, mana)
        assertEquals(21, result)
    }

}