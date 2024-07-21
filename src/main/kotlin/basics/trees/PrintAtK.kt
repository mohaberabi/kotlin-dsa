package basics.trees

import com.sun.source.tree.Tree
import core.TreeNode


private fun printNodesAtK(
    root: TreeNode?,
    k: Int,
) {

    if (root == null) {
        return
    }

    if (k == 0) {
        println(root.data)
    }
    printNodesAtK(root.left, k - 1)
    printNodesAtK(root.right, k - 1)
}


fun main() {
    val root = TreeNode(10).apply {
        left = TreeNode(6)
        right = TreeNode(8).apply {
            right = TreeNode(7).apply {
                left = TreeNode(11)
                right = TreeNode(12)
            }
        }
    }


    printNodesAtK(root, 3)
}