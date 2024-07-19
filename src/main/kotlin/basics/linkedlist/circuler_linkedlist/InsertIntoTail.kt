package basics.linkedlist.circuler_linkedlist

import basics.linkedlist.core.LinkedNode


private fun insertIntoTailNaive(
    data: Int,
    head: LinkedNode?
): LinkedNode {
    val inserted = LinkedNode(data)
    if (head == null) {
        inserted.next = inserted
        return inserted
    }
    var curr = head
    while (curr!!.next != head) {
        curr = curr.next
    }
    inserted.next = head
    curr.next = inserted
    return head
}

private fun insertIntoTail(
    data: Int,
    head: LinkedNode?
): LinkedNode {
    val inserted = LinkedNode(data)
    if (head == null) {
        inserted.next = inserted
        return inserted
    }
    inserted.next = head.next
    head.next = inserted
    head.next?.data = head.data
    head.data = data
    return inserted
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
    val newHead = insertIntoTail(900, head)
    printCircularLinkedList(newHead)
}