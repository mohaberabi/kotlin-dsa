package basics.hashing.impl


data class ChainedNode<K, V>(
    val value: V,
    val key: K,
    var next: ChainedNode<K, V>? = null,
)

class ChainedLinkedList<K, V> {

    private var head: ChainedNode<K, V>? = null
    private var tail: ChainedNode<K, V>? = null

    fun get(key: K): V? {
        if (head == null) {
            return null
        } else {
            if (head?.key == key) {
                return head?.value
            } else {
                var curr = head
                while (curr != null) {
                    if (curr.key == key) {
                        return curr.value
                    }
                    curr = curr.next
                }
            }

        }
        return null
    }

    fun remove(key: K) {
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
            if (curr.next?.key == tail?.key) {
                tail = curr
            }

            curr.next = curr.next?.next
        }
    }


    fun contains(key: K): Boolean {
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

    fun add(key: K, value: V) {
        if (head == null) {
            head = ChainedNode<K, V>(key = key, value = value)
            tail = head
        } else {
            tail?.next = ChainedNode<K, V>(key = key, value = value)
            tail = tail?.next
        }
    }

    fun forEach(act: (K, V) -> Unit) {
        var curr = head
        while (curr != null) {
            act(curr.key, curr.value)
            curr = curr.next
        }
    }
}