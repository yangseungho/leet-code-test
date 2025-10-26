package org.example.cote.bfs

import org.example.cote.help.TreeNode
import java.util.LinkedList
import java.util.Queue

// https://leetcode.com/problems/symmetric-tree/description

class SymmetricTree {
    fun isSymmetric(root: TreeNode?): Boolean {
        if (root == null) return true

        val queue: Queue<Pair<TreeNode?, TreeNode?>> = LinkedList()
        queue.add(Pair(root.left, root.right))

        while (queue.isNotEmpty()) {
            val (left, right) = queue.poll()

            if (left == null && right == null) continue
            if (left == null || right == null) return false
            if (left.`val` != right.`val`) return false

            // 대칭 순서로 삽입
            queue.add(Pair(left.left, right.right))
            queue.add(Pair(left.right, right.left))
        }
        return true
    }
}