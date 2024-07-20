package basics.linkedlist.singlelinkedlist

import core.LinkedNode
import basics.linkedlist.traverseLinkedListIterative


private fun addToTail(
    data: Int,
    head: LinkedNode?
): LinkedNode {

    val tail = LinkedNode(data)
    if (head == null) {
        return tail
    }
    var curr: LinkedNode? = head

    while (curr?.next != null) {
        curr = curr.next
    }
    curr?.next = tail
    return head
}

fun main() {

    val head1: LinkedNode? = null
    val head2 = LinkedNode(1).apply {
        next = LinkedNode(2).apply {
            next = LinkedNode(3).apply {
                next = LinkedNode(4).apply {
                    next = LinkedNode(100)
                }
            }
        }
    }
    val added1 = addToTail(data = 100, head = head1)
    traverseLinkedListIterative(added1)
    println()
    val added2 = addToTail(data = 500, head = head2)
    traverseLinkedListIterative(added2)

}