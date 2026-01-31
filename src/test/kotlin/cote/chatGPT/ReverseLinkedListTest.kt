package cote.chatGPT

import cote.leet.helper.LinkedListHelper
import org.example.cote.chatGPT.ReverseLinkedList
import org.example.cote.help.ListNode
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class ReverseLinkedListTest: LinkedListHelper() {
    private val reverse = ReverseLinkedList()

    @Test
    fun `First Case`() {
        val node = linkedListOf(1,2,3,4)
        val result = reverse.reverseList(node)
        assertContentEquals(listOf(4, 3, 2, 1), toList(result))
    }

    @Test
    fun `Second Case`() {
        val node = linkedListOf(1)
        val result = reverse.reverseList(node)
        assertContentEquals(listOf(1), toList(result))
    }
}