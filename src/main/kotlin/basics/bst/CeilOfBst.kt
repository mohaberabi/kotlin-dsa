package basics.bst

import core.TreeNode


fun TreeNode?.ceil(
    key: Int
): Int? {
    var ceil: Int? = null
    var curr = this
    while (curr != null) {
        if (curr.data == key) {
            return curr.data
        } else if (curr.data < key) {
            curr = curr.right
        } else {
            ceil = curr.data
            curr = curr.left
        }
    }
    return ceil
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
    var ceil = root.ceil(19)
    println(ceil)
}
