package basics.linkedlist.double_linkedlist

import basics.linkedlist.core.LinkedNode


private fun insertToHeadDoubly(
    head: LinkedNode?,
    data: Int
): LinkedNode {
    val inserted = LinkedNode(data)
    if (head == null) {
        return inserted
    }
    head.prev = inserted
    inserted.next = head
    return inserted
}