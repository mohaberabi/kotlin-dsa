package basics.linkedlist.singlelinkedlist

import core.LinkedNode


private fun removeDuplicatesFromSortedLinkedList(head: LinkedNode?): LinkedNode? {
    return if (head == null) {
        null
    } else {
        var curr: LinkedNode? = head

        while (curr?.next != null) {
            if (curr.data == curr.next?.data) {
                curr.next = curr.next?.next
            } else {
                curr = curr.next
            }
        }

        head
    }
}