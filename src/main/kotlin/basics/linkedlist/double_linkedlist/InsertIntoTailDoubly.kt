package basics.linkedlist.double_linkedlist

import basics.linkedlist.core.LinkedNode


private fun insertIntoTailDoubly(
    head: LinkedNode?,
    data: Int,
): LinkedNode {

    val inserted = LinkedNode(data)
    if (head == null) {
        return inserted
    }
    var curr = head

    while (curr?.next != null) {
        curr = curr.next
    }
    inserted.prev = curr
    curr?.next = inserted
    return head
}