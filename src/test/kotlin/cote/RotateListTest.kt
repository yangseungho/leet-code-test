package cote

import cote.leet.helper.LinkedListHelper
import org.example.cote.etc.linkedlist.RotateList
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RotateListTest: LinkedListHelper() {
    @Test
    fun `rotate list example 1`() {
        val solver = RotateList()
        val head = linkedListOf(1, 2, 3, 4, 5)
        val result = solver.rotateRight(head, 2)
        assertEquals(listOf(4, 5, 1, 2, 3), toList(result))
    }

    @Test
    fun `rotate list example 2`() {
        val solver = RotateList()
        val head = linkedListOf(0, 1, 2)
        val result = solver.rotateRight(head, 4)
        assertEquals(listOf(2, 0, 1), toList(result))
    }
}