package org.example.cote.etc.linkedlist

import org.example.cote.help.ListNode

class RotateList {
    fun rotateRight(head: ListNode?, k: Int): ListNode? {
        if (head == null || head.next == null || k == 0) return head

        // 1. 리스트 길이 계산
        var length = 1
        var tail = head
        while (tail?.next != null) {
            tail = tail.next
            length++
        }

        // 2. 원형 연결
        tail?.next = head

        // 3. 회전 위치 계산
        val rotatePoint = length - (k % length)
        var newTail = head
        repeat(rotatePoint - 1) { newTail = newTail?.next }

        val newHead = newTail?.next
        newTail?.next = null

        return newHead
    }
}