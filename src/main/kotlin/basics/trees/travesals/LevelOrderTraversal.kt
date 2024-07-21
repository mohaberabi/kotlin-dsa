package basics.trees.travesals

import basics.hashing.chaining.LinkedList
import com.sun.source.tree.Tree
import core.TreeNode
import java.util.concurrent.ConcurrentLinkedQueue


private fun levelOrderTraversal(
    root: TreeNode?
) {
    if (root == null) {
        return
    }

    val q = ConcurrentLinkedQueue<TreeNode>()
    q.add(root)

    while (q.isNotEmpty()) {
        val pop = q.poll()
        print("${pop.data} ")

        pop.left?.let {
            q.add(it)
        }
        pop.right?.let {
            q.add(it)
        }
    }


}


fun main() {
    val root = TreeNode(8).apply {
        right = TreeNode(6).apply {
            left = TreeNode(2)
            right = TreeNode(4).apply {
                left = TreeNode(3)
            }
        }
    }

    levelOrderTraversal(root)
}