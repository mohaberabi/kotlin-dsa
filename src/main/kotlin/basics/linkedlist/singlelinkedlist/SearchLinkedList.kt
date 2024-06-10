package basics.linkedlist.singlelinkedlist

import basics.linkedlist.core.LinkedNode


private fun searchLinkedListIterative(

    head: LinkedNode?,
    key: Int
): Int {
    if (head == null) {
        return -1
    }
    var curr: LinkedNode? = head

    var res = 0
    while (curr != null) {
        if (curr.data == key) {
            return res + 1
        }
        res++
        curr = curr.next
    }
    return -1
}

private fun searchLinkedListRecursive(
    head: LinkedNode?,
    key: Int,
): Int = searchLinkedListRecursive(head, key, 1)

private fun searchLinkedListRecursive(
    head: LinkedNode?,
    key: Int,
    pos: Int = 1
): Int {
    if (head == null) {
        return -1
    }
    if (head.data == key) {
        return pos
    }
    return searchLinkedListRecursive(head.next, key, pos + 1)
}

fun main() {

    val head = LinkedNode(1).apply {
        next = LinkedNode(2).apply {
            next = LinkedNode(3).apply {
                next = LinkedNode(4).apply {
                    next = LinkedNode(100)
                }
            }
        }
    }

    val resIt = searchLinkedListIterative(head, 100)
    val resRec = searchLinkedListRecursive(head, 100)

    println(resIt)
    println(resRec)

}