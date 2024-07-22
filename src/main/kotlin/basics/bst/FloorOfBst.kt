package basics.bst

import core.TreeNode


fun TreeNode?.floor(
    key: Int,
): Int? {
    var floor: Int? = null
    var curr = this
    while (curr != null) {
        if (curr.data == key) {
            return curr.data
        } else if (curr.data > key) {
            curr = curr.left
        } else {
            floor = curr.data
            curr = curr.right
        }
    }
    return floor
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
    var floor = root.floor(21)
    println(floor)
}
