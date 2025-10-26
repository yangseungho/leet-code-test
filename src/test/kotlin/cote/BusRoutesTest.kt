package cote

import org.example.cote.bfs.BusRoutes
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BusRoutesTest {
    private val busRoutes = BusRoutes()

    @Test
    fun `First Case`() {
        val routes = arrayOf(
            intArrayOf(1,2,7),
            intArrayOf(3,6,7),
        )
        val result = busRoutes.numBusesToDestination(routes, 1, 6)
        assertEquals(2, result)
    }

    @Test
    fun `Second Case`() {
        val routes = arrayOf(
            intArrayOf(7,12),
            intArrayOf(4,5,15),
            intArrayOf(6),
            intArrayOf(15, 19),
        )
        val result = busRoutes.numBusesToDestination(routes, 15, -12)
        assertEquals(-1, result)
    }

    @Test
    fun `Third Case`() {
        val routes = arrayOf(
            intArrayOf(1,7),
            intArrayOf(3,5),
        )
        val result = busRoutes.numBusesToDestination(routes, 5, 5)
        assertEquals(1, result)
    }
}