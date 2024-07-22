package basics.bst

import core.TreeNode


fun TreeNode?.insertBstRecursive(
    root: TreeNode? = this,
    data: Int
): TreeNode {
    val inserted = TreeNode(data)
    return if (root == null) {
        inserted
    } else {
        if (data > root.data) {
            root.right = insertBstRecursive(root.right, data)
        } else {
            root.left = insertBstRecursive(root.left, data)
        }
        root
    }
}


fun TreeNode?.insertBstIterative(
    root: TreeNode? = this,
    data: Int
): TreeNode {
    val inserted = TreeNode(data)
    return if (root == null) {
        inserted
    } else {
        var curr = root
        var prev = root
        while (curr != null) {
            prev = curr
            curr = if (data > curr.data) {
                curr.right
            } else {
                curr.left
            }
        }

        prev?.let {
            if (data > it.data) {
                it.right = inserted
            } else {
                it.left = inserted
            }
            root
        } ?: inserted

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
    with(root) {
        insertBstRecursive(data = 900)
        println(searchBstRecursive(key = 900))
        println(searchBstIterative(key = 900))
        insertBstIterative(data = 1000)
        println(searchBstRecursive(key = 1000))
        println(searchBstIterative(key = 1000))
    }

}
