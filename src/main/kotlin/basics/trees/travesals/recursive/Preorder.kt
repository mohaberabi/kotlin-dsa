package basics.trees.travesals.recursive

import core.TreeNode


private fun preOrder(root: TreeNode?) {

    if (root == null) {
        return
    }
    print("${root.data} ")
    preOrder(root.left)
    preOrder(root.right)
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
    preOrder(root)
}