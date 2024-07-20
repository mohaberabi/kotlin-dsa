package basics.linkedlist.circuler_linkedlist

import core.LinkedNode


fun printCircularLinkedList(
    head: LinkedNode?,
) {
    if (head == null) {
        return
    }
    var curr: LinkedNode? = head
    do {
        println(curr?.data)
        curr = curr?.next
    } while (curr != head)

}

fun printCircularLinkedList2(
    head: LinkedNode?,
) {


    if (head == null) {
        return
    }
    println(head.data)
    var curr = head.next
    // assuming that it will never be null and it is called from
    // circular linked list scope
    while (curr != head) {
        println(curr!!.data)
        curr = curr.next
    }

}


fun main() {
    val tail = LinkedNode(5)
    val head = LinkedNode(1).apply {
        next = LinkedNode(2).apply {
            next = LinkedNode(3).apply {
                next = LinkedNode(4).apply {
                    next = tail
                }
            }
        }
    }
    tail.next = head
    printCircularLinkedList(head)
    printCircularLinkedList2(head)
}