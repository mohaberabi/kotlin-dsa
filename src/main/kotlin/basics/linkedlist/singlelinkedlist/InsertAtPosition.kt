package basics.linkedlist.singlelinkedlist

import basics.linkedlist.core.LinkedNode
import basics.linkedlist.core.traverseLinkedListIterative


private fun insertAtPosition(
    data: Int,
    position: Int,
    head: LinkedNode?
): LinkedNode? {

    val added = LinkedNode(data)

    return if (position == 1) {
        added.next = head
        return added
    } else {
        var curr: LinkedNode? = head
        var count = 0
        while (count < position - 2) {
            count++
            curr = curr?.next
        }
        if (curr == null) {
            head
        } else {
            val next = curr.next
            added.next = next
            curr.next = added
            head
        }
    }


}


fun main() {
    val head = LinkedNode(10).apply {
        next = LinkedNode(20).apply {
            next = LinkedNode(30).apply {
                next = LinkedNode(40)
            }
        }
    }
    val added = 35
    insertAtPosition(data = added, position = 3, head = head)
    traverseLinkedListIterative(head)
}

private fun getSize(
    head: LinkedNode?,
): Int {
    return if (head == null) {
        0
    } else {
        var res = 0
        var curr: LinkedNode? = head
        while (curr != null) {
            res++
            curr = curr.next
        }
        res
    }

}
