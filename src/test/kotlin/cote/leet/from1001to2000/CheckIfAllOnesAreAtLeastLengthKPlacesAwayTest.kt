package cote.leet.from1001to2000

import org.example.cote.etc.noalgorithm.CheckIfAllOnesAreAtLeastLengthKPlacesAway
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CheckIfAllOnesAreAtLeastLengthKPlacesAwayTest {
    private val kPlacesAway = CheckIfAllOnesAreAtLeastLengthKPlacesAway()

    @Test
    fun `First Case`() {
        val nums = intArrayOf(1,0,0,0,1,0,0,1)
        val result = kPlacesAway.kLengthApart(nums, 2)
        assertEquals(true, result)
    }

    @Test
    fun `Second Case`() {
        val nums = intArrayOf(1,0,0,1,0,1)
        val result = kPlacesAway.kLengthApart(nums, 2)
        assertEquals(false, result)
    }

}