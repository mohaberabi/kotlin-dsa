package basics.trees

import core.TreeNode
import kotlin.math.max


private fun maximumOfBinaryTree(
    root: TreeNode?,
): Int {

    if (root == null) {
        return Int.MIN_VALUE
    }
    val current = root.data
    val left = maximumOfBinaryTree(root.left)
    val right = maximumOfBinaryTree(root.right)
    return max(current, max(left, right))
}

fun main() {

    val root = TreeNode(8).apply {
        right = TreeNode(6).apply {
            left = TreeNode(2)
            right = TreeNode(4).apply {
                left = TreeNode(3)
                right = TreeNode(90988)
            }
        }
    }
    println(maximumOfBinaryTree(root))
}