package basics.linkedlist.singlelinkedlist

import core.LinkedNode
import basics.linkedlist.traverseLinkedListIterative


private fun sortedInsertIntoLinkedList(
    data: Int,
    head: LinkedNode?
): LinkedNode {
    val added = LinkedNode(data)
    if (head == null) {
        return added
    }
    if (data <= head.data) {
        added.next = head
        return added
    }
    var curr: LinkedNode? = head

    while (curr?.next != null && curr.next?.data!! <= data) {
        curr = curr.next
    }
    added.next = curr?.next
    curr?.next = added
    return head
}

fun main() {

    var head = LinkedNode(10).apply {
        next = LinkedNode(20).apply {
            next = LinkedNode(30).apply {
                next = LinkedNode(40).apply {
                    next = LinkedNode(50)
                }
            }
        }
    }
    head = sortedInsertIntoLinkedList(45, head)
    traverseLinkedListIterative(head)
}