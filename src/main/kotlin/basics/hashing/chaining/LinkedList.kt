package basics.hashing.chaining

data class LinkedNode(
    val key: Int,
    var next: LinkedNode? = null
)


class LinkedList(
    private var head: LinkedNode? = null,
    private var tail: LinkedNode? = null
) {


    fun insert(key: Int) {
        if (head == null) {
            head = LinkedNode(key)
            tail = head
        } else {
            tail?.next = LinkedNode(key)
            tail = tail?.next
        }
    }


    fun remove(key: Int) {
        if (head == null) {
            return
        }

        if (head?.key == key) {
            head = head?.next
            if (head == null) {
                tail = null
            }
            return
        }

        var curr = head
        while (curr != null && curr.next?.key != key) {
            curr = curr.next
        }

        if (curr?.next != null) {
            if (curr.next == tail) {
                tail = curr
            }
            curr.next = curr.next?.next
        }

    }

    fun contains(key: Int): Boolean {
        return if (head == null) {
            false
        } else {
            var curr = head
            while (curr != null) {
                if (curr.key == key) {
                    return true
                }
                curr = curr.next
            }
            false
        }
    }
}