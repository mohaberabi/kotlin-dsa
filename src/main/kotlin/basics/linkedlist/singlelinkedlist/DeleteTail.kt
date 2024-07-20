package basics.linkedlist.singlelinkedlist

import core.LinkedNode


private fun deleteTail(

    head: LinkedNode?
): LinkedNode? {

    if (head == null) {
        return null
    }

    var curr: LinkedNode? = head
    while (curr?.next?.next != null) {
        curr = curr.next
    }
    curr?.next = null
    return head
}