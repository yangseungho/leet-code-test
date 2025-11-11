package cote.leet.helper

import org.example.cote.help.ListNode

open class LinkedListHelper {
    open fun linkedListOf(vararg values: Int): ListNode? {
        if (values.isEmpty()) return null
        val head = ListNode(values[0])
        var current = head
        for (v in values.drop(1)) {
            current.next = ListNode(v)
            current = current.next!!
        }
        return head
    }

    open fun toList(head: ListNode?): List<Int> {
        val result = mutableListOf<Int>()
        var current = head
        while (current != null) {
            println("${current.`val`}")
            result.add(current.`val`)
            current = current.next
        }
        return result
    }
}