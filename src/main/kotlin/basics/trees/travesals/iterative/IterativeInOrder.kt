package basics.trees.travesals.iterative

import core.TreeNode
import java.util.Stack


private fun iterativeInOrderTraversal(
    root: TreeNode?
) {


    val stack = Stack<TreeNode>()
    var curr = root

    while (curr != null || stack.isNotEmpty()) {

        while (curr != null) {
            stack.push(curr)
            curr = curr.left
        }
        curr = stack.pop()
        print("${curr.data} ")
        curr = curr?.right
    }

}


fun main() {
    val root = TreeNode(10).apply {
        right = TreeNode(30)
        left = TreeNode(20).apply {
            left = TreeNode(40)
            right = TreeNode(50)
        }

    }
    iterativeInOrderTraversal(root)
}