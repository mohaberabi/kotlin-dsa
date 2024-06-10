package basics.linkedlist.core


fun traverseLinkedListIterative(
    head: LinkedNode?
) {


    var curr: LinkedNode? = head
    while (curr != null) {
        print("${curr.data} ")
        curr = curr.next
    }
}

fun traverseLinkedListRecursive(
    head: LinkedNode?
) {
    if (head == null) {
        return
    }
    print("${head.data} ")
    traverseLinkedListRecursive(head.next)
}


fun main() {

    val head = LinkedNode(1).apply {
        next = LinkedNode(2).apply {
            next = LinkedNode(3).apply {
                next = LinkedNode(4).apply {
                    next = LinkedNode(5)
                }
            }
        }
    }

    traverseLinkedListRecursive(head)
    println()
    traverseLinkedListIterative(head)

}