package basics.linkedlist.singlelinkedlist

import core.LinkedNode


private fun nthNodeFromEndOptimal(n: Int, head: LinkedNode?): Int {
    return if (head == null) {
        -1
    } else {

        var first: LinkedNode? = head

        var second: LinkedNode? = head

        for (i in 0..<n) {

            first = first?.next
        }
        if (first == null) {
            -1
        } else {
            while (first != null) {
                first = first.next
                second = second?.next
            }
        }

        second?.data ?: -1
    }
}

private fun getSize(head: LinkedNode?): Int {
    return if (head == null) {
        0
    } else {
        var curr: LinkedNode? = head
        var size = 0
        while (curr != null) {
            size++
            curr = curr.next
        }
        size
    }
}

private fun nthNodeFromEnd(n: Int, head: LinkedNode?): Int {

    return if (head == null) {
        -1
    } else {
        val size = getSize(head)
        if (size < n) {
            -1
        } else {
            val bound = (size - n + 1)
            var count = 1
            var curr: LinkedNode? = head
            while (count <= bound - 1) {
                count++
                curr = curr?.next
            }
            curr?.data ?: -1
        }

    }
}

fun main() {
    val head = LinkedNode(10).apply {
        next = LinkedNode(20).apply {
            next = LinkedNode(30).apply {
                next = LinkedNode(40).apply {
                    next = LinkedNode(50).apply {
                        next = LinkedNode(60)
                    }
                }
            }
        }
    }

    for (i in 1..6) {
        var naive = nthNodeFromEnd(i, head).also {
            println(it)
        }
        var otpimal = nthNodeFromEndOptimal(i, head).also {
            println(it)
        }
    }

}