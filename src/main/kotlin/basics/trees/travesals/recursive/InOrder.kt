package basics.trees.travesals.recursive

import com.sun.source.tree.Tree
import core.TreeNode


private fun inOrder(root: TreeNode?) {

    if (root == null) {
        return
    }
    inOrder(root.left)
    print("${root.data} ")
    inOrder(root.right)
}


fun main() {
    val root = TreeNode(1).apply {
        left = TreeNode(2).apply {
            right = TreeNode(5).apply {
                left = TreeNode(213)
            }
        }
        right = TreeNode(22)
    }
    inOrder(root)
}