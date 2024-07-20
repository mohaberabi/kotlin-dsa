package basics.dequeue


private data class DeqNode<T>(
    val data: T,
    var next: DeqNode<T>? = null,
    var prev: DeqNode<T>? = null,
)

class MyLinkedDequeue<T> : MyDequeue<T> {
    private var head: DeqNode<T>? = null
    private var tail: DeqNode<T>? = null
    private var _size = 0
    override fun addRear(t: T) {

        val inserted = DeqNode(t)
        if (tail == null) {
            head = inserted
            tail = head
        } else {
            tail?.next = inserted
            inserted.prev = tail
            tail = inserted
        }
        _size++
    }

    override fun addFront(t: T) {
        val inserted = DeqNode(t)
        if (head == null) {
            head = inserted
            tail = head
        } else {
            inserted.next = head
            head?.prev = inserted
            head = inserted
        }
        _size++

    }

    override fun deleteFront(): T? {
        if (head == null) {
            return null
        }
        val data = head?.data
        head = head?.next
        if (head == null) {
            tail = null
        } else {
            head?.prev = null
        }
        _size--
        return data
    }

    override fun deleteRear(): T? {
        if (tail == null) {
            return null
        }
        val data = tail?.data
        tail = tail?.prev
        if (tail == null) {
            head = null
        } else {
            tail?.next = null
        }
        _size--
        return data
    }

    override fun front(): T? = head?.data

    override fun rear(): T? = tail?.data

    override fun isEmpty(): Boolean = head == null
    override fun size(): Int = _size

}