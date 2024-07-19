package basics.linkedlist.double_linkedlist

import basics.linkedlist.core.LinkedNode


private fun deleteHeadDoubly(
    head: LinkedNode?,
): LinkedNode? {
    if (head?.next == null) {
        return null
    }
    val next = head.next
    next?.prev = null
    return next
}