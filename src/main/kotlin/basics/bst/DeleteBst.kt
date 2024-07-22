package basics.bst

import core.TreeNode


fun TreeNode?.delete(
    data: Int,
    root: TreeNode? = this,
): TreeNode? {
    if (root == null) {
        return null
    }
    if (root.data > data) {
        root.left = delete(data, root.left)
    } else if (root.data < data) {
        root.right = delete(data, root.right)
    } else {
        if (root.left == null) {
            return root.right
        } else if (root.right == null) {
            return root.left
        } else {
            val succ = root.inOrderSuccusser
            root.data = succ.data
            root.right = delete(data = succ.data, root = succ)
        }
    }
    return root
}


val TreeNode?.inOrderSuccusser: TreeNode
    get() {
        var curr = this?.right
        while (curr?.left != null) {
            curr = curr.left
        }
        return curr!!
    }

fun main() {
    val root = TreeNode(15).apply {
        left = TreeNode(5).apply {
            left = TreeNode(3)
        }
        right = TreeNode(20).apply {
            left = TreeNode(18).apply {
                left = TreeNode(16)
            }
            right = TreeNode(80)
        }
    }
    with(root) {

        println(searchBstIterative(key = 20))
        delete(data = 20)
        println(searchBstIterative(key = 20))
    }
}