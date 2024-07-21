package basics.trees

import com.sun.source.tree.Tree
import core.TreeNode
import kotlin.math.max


private fun heightOfBinaryTree(
    root: TreeNode?,
): Int {

    if (root == null) {
        return 0
    }
    val right = heightOfBinaryTree(root.right)
    val left = heightOfBinaryTree(root.left)
    return max(right, left) + 1
}


fun main() {
    val root = TreeNode(1).apply {

        left = TreeNode(2).apply {
            left = TreeNode(3).apply {
                left = TreeNode(4).apply {
                    left = TreeNode(5).apply {
                        left = TreeNode(6).apply {
                            left = TreeNode(7)
                        }
                    }
                }
            }
        }
    }
    println(heightOfBinaryTree(root))
}