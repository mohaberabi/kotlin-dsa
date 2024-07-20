package basics.linkedlist.singlelinkedlist

import core.LinkedNode


private fun recursiveReverseLinkedList(
    head: LinkedNode?,
    prev: LinkedNode?,

    ): LinkedNode? {
    return if (head == null) {
        prev
    } else {
        val next: LinkedNode? = head.next
        head.next = prev
        recursiveReverseLinkedList(next, head)
    }

}


private fun recursiveReverseLinkedList2(head: LinkedNode?): LinkedNode? {
    if (head == null) {
        return null
    }
    if (head.next == null) {
        return head
    }
    val restHead = recursiveReverseLinkedList2(head.next)
    val restTail = head.next
    restTail?.next = head
    head.next = null
    return restHead
}