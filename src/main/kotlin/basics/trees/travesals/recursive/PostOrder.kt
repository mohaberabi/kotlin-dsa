package basics.trees.travesals.recursive

import core.TreeNode


private fun postOrder(root: TreeNode?) {

    if (root == null) {
        return
    }
    postOrder(root.left)
    postOrder(root.right)
    print("${root.data} ")
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
    postOrder(root)
}