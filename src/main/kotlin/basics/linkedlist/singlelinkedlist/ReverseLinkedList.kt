package basics.linkedlist.singlelinkedlist

import core.LinkedNode


fun reverseLinkedListNaive2(head: LinkedNode?): LinkedNode? {

    return if (head == null) {
        null
    } else {
        val list = mutableListOf<Int>()
        var curr: LinkedNode? = head
        while (curr != null) {
            list.add(curr.data)
            curr = curr.next
        }
        curr = head
        while (curr != null) {
            curr.data = list.removeAt(list.size - 1)
            curr = curr.next
        }
        curr
    }
}


fun reverseLinkedListNaive1(head: LinkedNode?): LinkedNode? {
    return if (head == null) {
        null
    } else {
        val list = mutableListOf<Int>()
        var curr = head
        while (curr != null) {
            list.add(curr.data)
            curr = curr.next
        }
        val newHead = LinkedNode(-1)
        var tail: LinkedNode? = newHead
        while (list.isNotEmpty()) {
            tail?.next = LinkedNode(list.removeAt(list.size - 1))
            tail = tail?.next
        }
        newHead.next
    }
}

fun reverseLinkedListIterativeOptimal(head: LinkedNode?): LinkedNode? {
    return if (head == null) {
        null
    } else {
        var prev: LinkedNode? = null
        var curr = head
        while (curr != null) {
            val next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        }
        prev
    }
}