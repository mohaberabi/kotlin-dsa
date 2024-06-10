package basics.linkedlist.singlelinkedlist

import basics.linkedlist.core.LinkedNode
import basics.linkedlist.core.traverseLinkedListIterative


private fun deleteHead(
    head: LinkedNode?,
): LinkedNode? {
    if (head == null) {
        return null
    }
    return head.next
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

    val newHead = deleteHead(head)
    traverseLinkedListIterative(newHead)

}