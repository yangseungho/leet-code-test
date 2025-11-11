package cote.leet.from3001to4000

import cote.leet.helper.LinkedListHelper
import org.example.cote.etc.linkedlist.DeleteNodesFromLinkedListPresentInArray
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DeleteNodesFromLinkedListPresentInArrayTest: LinkedListHelper()  {
    private val deleteNodes = DeleteNodesFromLinkedListPresentInArray()

    @Test
    fun testExample1() {
        val nums = intArrayOf(1, 2, 3)
        val head = linkedListOf(1, 2, 3, 4, 5)
        val result = deleteNodes.modifiedList(nums, head)
        assertEquals(listOf(4, 5), toList(result))
    }

    @Test
    fun testExample2() {
        val nums = intArrayOf(1)
        val head = linkedListOf(1, 2, 1, 2, 1, 2)
        val result = deleteNodes.modifiedList(nums, head)
        assertEquals(listOf(2, 2, 2), toList(result))
    }

    @Test
    fun testExample3() {
        val nums = intArrayOf(5)
        val head = linkedListOf(1, 2, 3, 4)
        val result = deleteNodes.modifiedList(nums, head)
        assertEquals(listOf(1, 2, 3, 4), toList(result))
    }
}