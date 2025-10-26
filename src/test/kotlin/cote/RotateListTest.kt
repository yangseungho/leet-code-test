package cote

import org.example.cote.etc.linkedlist.RotateList
import org.example.cote.help.ListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RotateListTest {
    private fun listOf(vararg values: Int): ListNode? {
        if (values.isEmpty()) return null
        val head = ListNode(values[0])
        var current = head
        for (v in values.drop(1)) {
            current.next = ListNode(v)
            current = current.next!!
        }
        return head
    }

    private fun toList(head: ListNode?): List<Int> {
        val result = mutableListOf<Int>()
        var current = head
        while (current != null) {
            result.add(current.`val`)
            current = current.next
        }
        return result
    }

    @Test
    fun `rotate list example 1`() {
        val solver = RotateList()
        val head = listOf(1, 2, 3, 4, 5)
        val result = solver.rotateRight(head, 2)
        assertEquals(listOf(4, 5, 1, 2, 3), toList(result))
    }

    @Test
    fun `rotate list example 2`() {
        val solver = RotateList()
        val head = listOf(0, 1, 2)
        val result = solver.rotateRight(head, 4)
        assertEquals(listOf(2, 0, 1), toList(result))
    }
}