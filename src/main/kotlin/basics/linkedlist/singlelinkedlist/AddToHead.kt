package basics.linkedlist.singlelinkedlist

import basics.linkedlist.core.LinkedNode
import basics.linkedlist.core.traverseLinkedListIterative

private fun addToHead2(
    data: Int,
    head: LinkedNode?
): LinkedNode {
    val added = LinkedNode(data)
    added.next = head
    return added
}


private fun addToHead(
    data: Int,
    head: LinkedNode?
): LinkedNode {

    val added = LinkedNode(data)
    if (head == null) {
        return added
    }
    added.next = head
    return added

}

fun main() {

    val head1: LinkedNode? = null

    val added = addToHead(head = head1, data = 100)

    traverseLinkedListIterative(added)
    println()
    val added2 = addToHead(head = added, data = 200)
    traverseLinkedListIterative(added2)

}