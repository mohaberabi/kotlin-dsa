package basics.linkedlist.circuler_linkedlist

import basics.linkedlist.core.LinkedNode
import basics.linkedlist.core.traverseLinkedListIterative


private fun insertIntoCircularLinkedListHead(
    data: Int,
    head: LinkedNode?
): LinkedNode {

    val inserted = LinkedNode(data)

    if (head == null) {
        inserted.next = inserted
        return inserted
    }
    val currData = head.data
    val next = head.next
    head.next = LinkedNode(currData)
    head.next?.next = next
    head.data = data
    return head
}

private fun insertIntoCircularLinkedListHeadNaive(
    data: Int,
    head: LinkedNode?
): LinkedNode {
    val inserted = LinkedNode(data)
    if (head == null) {
        inserted.next = inserted
    }
    var curr = head
    while (curr!!.next != head) {
        curr = curr.next
    }
    curr.next = inserted
    inserted.next = head
    return inserted
}

fun main() {


//    val tail = LinkedNode(5)
//    val head = LinkedNode(1).apply {
//        next = LinkedNode(2).apply {
//            next = LinkedNode(3).apply {
//                next = LinkedNode(4).apply {
//                    next = tail
//                }
//            }
//        }
//    }
//    tail.next = head
////    printCircularLinkedList(head)
//    val newHead = insertIntoCircularLinkedListHeadNaive(100, head)
//    printCircularLinkedList(newHead)
}

//inline fun buildLinkedList(
//    initial: Int, action: LinkedNode.() -> Unit,
//): LinkedNode {
//    return LinkedNode(
//        initial,
//    ).apply(action)
//
//}