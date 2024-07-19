package basics.linkedlist.circuler_linkedlist

import basics.linkedlist.core.LinkedNode


private fun deleteKth(
    head: LinkedNode?,
    k: Int
): LinkedNode? {


    if (head == null) {
        return null
    }
    if (k == 1) {
        if (head.next == head) {
            return null
        }
        val next = head.next
        head.data = next!!.data
        head.next = head.next?.next
        return head
    }

    var curr = head
    var count = 0
    while (count < k - 2) {
        curr = curr?.next
        count++
    }
    curr?.next = curr?.next?.next
    return head
}