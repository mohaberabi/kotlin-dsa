package basics.bst

import core.TreeNode


fun TreeNode?.searchBstRecursive(
    root: TreeNode? = this,
    key: Int
): Boolean {

    return if (root == null) {
        false
    } else if (root.data == key) {
        true
    } else if (root.data > key) {
        searchBstRecursive(root.left, key)
    } else {
        searchBstRecursive(root.right, key)
    }
}

fun TreeNode?.searchBstIterative(
    root: TreeNode? = this,
    key: Int
): Boolean {
    return if (root == null) {
        return false
    } else {
        var curr = root
        while (curr != null) {
            curr = if (curr.data == key) {
                return true
            } else if (curr.data > key) {
                curr.left
            } else {
                curr.right
            }
        }
        false
    }
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
    val searchRec = root.searchBstRecursive(root, 80)
    println(searchRec)
    val searchIt = root.searchBstIterative(root, 80)
    println(searchIt)
}
