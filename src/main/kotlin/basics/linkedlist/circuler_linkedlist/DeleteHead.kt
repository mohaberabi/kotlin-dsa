package basics.linkedlist.circuler_linkedlist

import core.LinkedNode


private fun deleteHead(
    head: LinkedNode?,
): LinkedNode? {

    if (head == null) {
        return head
    }

    if (head.next == head) {
        return null
    }
    val next = head.next
    head.data = next!!.data
    head.next = head.next?.next
    return head
}


fun main() {

    val tail = LinkedNode(5)
    val head = LinkedNode(1).apply {
        next = LinkedNode(2).apply {
            next = LinkedNode(3).apply {
                next = LinkedNode(4).apply {
                    next = tail
                }
            }
        }
    }
    tail.next = head

    val newHead = deleteHead(head)
    printCircularLinkedList(newHead)
}