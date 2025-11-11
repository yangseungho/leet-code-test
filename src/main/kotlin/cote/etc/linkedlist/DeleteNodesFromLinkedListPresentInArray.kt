package org.example.cote.etc.linkedlist

import org.example.cote.help.ListNode

//https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array

class DeleteNodesFromLinkedListPresentInArray {
    fun modifiedList(nums: IntArray, head: ListNode?): ListNode? {
        val removeSet = nums.toHashSet()  // contains() O(1)로 최적화
        var dummy = ListNode(0)           // 새 리스트의 시작을 가리킬 dummy
        var tail = dummy                  // 새 리스트의 현재 끝을 가리키는 포인터
        var current = head

        while (current != null) {
            if (current.`val` !in removeSet) {
                tail.next = ListNode(current.`val`)
                tail = tail.next!!
            }
            current = current.next
        }

        return dummy.next
    }
}