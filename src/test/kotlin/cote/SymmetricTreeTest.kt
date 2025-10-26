package cote

import org.example.cote.bfs.SymmetricTree
import org.example.cote.help.TreeNode
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import java.util.*
import kotlin.test.assertTrue

class SymmetricTreeTest {
    private val symmetricTree = SymmetricTree()

    private fun buildTree(values: Array<Int?>): TreeNode? {
        if (values.isEmpty() || values[0] == null) return null
        val root = TreeNode(values[0]!!)
        val queue: Queue<TreeNode> = LinkedList()
        queue.add(root)
        var i = 1
        while (queue.isNotEmpty() && i < values.size) {
            val node = queue.poll()

            // 왼쪽 자식
            if (i < values.size && values[i] != null) {
                node.left = TreeNode(values[i]!!)
                queue.add(node.left)
            }
            i++

            // 오른쪽 자식
            if (i < values.size && values[i] != null) {
                node.right = TreeNode(values[i]!!)
                queue.add(node.right)
            }
            i++
        }
        return root
    }

    @Test
    fun `First Case`() {
        val root = buildTree(arrayOf(1, 2, 2, 3, 4, 4, 3))
        val result = symmetricTree.isSymmetric(root)
        assertTrue(result)
    }

    @Test
    fun `Second Case`() {
        val root = buildTree(arrayOf(1, 2, 2, null, 3, null, 3))
        val result = symmetricTree.isSymmetric(root)
        assertFalse(result)
    }

    @Test
    fun `Empty Case`() {
        val root = buildTree(arrayOf())
        val result = symmetricTree.isSymmetric(root)
        assertTrue(result)
    }
}