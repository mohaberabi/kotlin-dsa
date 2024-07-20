package basics.linkedlist.double_linkedlist

import core.LinkedNode
import basics.linkedlist.traverseLinkedListIterative


private fun deleteLastDouble(
    head: LinkedNode?,
): LinkedNode? {


    if (head == null) {
        return null
    }
    if (head.next == null) {
        return null
    }

    var curr: LinkedNode? = head

    while (curr?.next?.next != null) {
        curr = curr.next
    }
    curr?.next = null
    return head

}


fun main() {


    val head = LinkedNode(1).apply {
        next = LinkedNode(2).apply {
            next = LinkedNode(3).apply {
                next = LinkedNode(4).apply {
                    next = LinkedNode(5)
                }
            }
        }
    }


    val newHead = deleteLastDouble(head)
    traverseLinkedListIterative(newHead)
}