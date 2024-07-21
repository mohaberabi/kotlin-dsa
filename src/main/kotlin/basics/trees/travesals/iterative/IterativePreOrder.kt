package basics.trees.travesals.iterative

import basics.trees.travesals.levelOrderTraversal
import com.sun.source.tree.Tree
import core.TreeNode
import java.util.Stack


private fun iterativePreOrderTraversal(
    root: TreeNode?,
) {


    if (root == null) {
        return
    }
    val stack = Stack<TreeNode>()
    stack.push(root)
    while (stack.isNotEmpty()) {
        val pop = stack.pop()
        print("${pop.data} ")
        pop.right?.let {
            stack.push(it)
        }
        pop.left?.let {
            stack.push(it)
        }
    }


}

private fun iterativePreOrderTraversalSpaceOptimized(
    root: TreeNode?,
) {


    if (root == null) {
        return
    }
    var curr = root
    val stack = Stack<TreeNode>()
    while (stack.isNotEmpty() || curr != null) {
        while (curr != null) {
            print("${curr.data} ")
            curr.right?.let {
                stack.push(it)
            }
            curr = curr.left
        }
        if (stack.isNotEmpty()) {
            curr = stack.pop()
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

    iterativePreOrderTraversal(root)
    iterativePreOrderTraversalSpaceOptimized(root)

}