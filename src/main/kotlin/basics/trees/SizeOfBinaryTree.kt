package basics.trees

import core.TreeNode


private fun sizeOfBinaryTree(
    root: TreeNode?
): Int {

    if (root == null) {
        return 0
    }
    return sizeOfBinaryTree(root.left) + sizeOfBinaryTree(root.right) + 1
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
    println(sizeOfBinaryTree(root))
}
