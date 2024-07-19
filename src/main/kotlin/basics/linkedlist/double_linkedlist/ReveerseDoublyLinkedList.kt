package basics.linkedlist.double_linkedlist

import basics.linkedlist.core.LinkedNode
import basics.linkedlist.core.traverseLinkedListIterative


private fun reverseDoubleLinkedList(
    head: LinkedNode?,
): LinkedNode? {


    if (head?.next == null) {
        return null
    }
    var prev: LinkedNode? = null
    var curr = head
    while (curr != null) {
        prev = curr.prev
        curr.prev = curr.next
        curr.next = prev
        curr = curr.prev

    }
    return prev?.prev
}

fun main() {
    val head = LinkedNode(1)
    val next = LinkedNode(2)
    head.next = next
    next.prev = head
    val nextNext = LinkedNode(3)
    next.next = nextNext
    nextNext.prev = next
    val rev = reverseDoubleLinkedList(head)
    traverseLinkedListIterative(rev)
}