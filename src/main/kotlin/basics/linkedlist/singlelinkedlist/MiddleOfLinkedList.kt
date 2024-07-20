package basics.linkedlist.singlelinkedlist

import core.LinkedNode


private fun getLinkedListSize(head: LinkedNode?): Int {
    return if (head == null) {
        0
    } else {
        var size = 0
        var curr: LinkedNode? = head
        while (curr != null) {
            size++
            curr = curr.next
        }
        size
    }
}


private fun middleOfLinkedListOptimal(head: LinkedNode?): Int {
    return if (head == null) {
        -1
    } else {
        var slow: LinkedNode? = head
        var fast: LinkedNode? = head
        while (slow != null && fast?.next != null) {
            slow = slow.next
            fast = fast.next?.next
        }
        slow!!.data
    }
}

private fun middleOfLinkedListNaive(head: LinkedNode?): Int {
    return if (head == null) {
        -1
    } else {
        val size = getLinkedListSize(head)
        var curr: LinkedNode? = head
        var count = 0
        while (count < size / 2) {
            count++
            curr = curr?.next
        }
        curr!!.data
    }
}


fun main() {
    val head = LinkedNode(10).apply {
        next = LinkedNode(20).apply {
            next = LinkedNode(30).apply {
                next = LinkedNode(40).apply {
                    next = LinkedNode(50)
                }
            }
        }
    }

    var naiveRes = middleOfLinkedListNaive(head).also {
        println(it)
    }
    var optimalRes = middleOfLinkedListOptimal(head).also {
        println(it)
    }

}