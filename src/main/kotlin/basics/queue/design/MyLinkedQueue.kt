package basics.queue.design


private data class QNode<T>(
    val data: T,
    var next: QNode<T>? = null,
)

class MyLinkedQueue<T> : MyQueue<T> {

    private var _size = 0
    private var head: QNode<T>? = null
    private var tail: QNode<T>? = null

    override val size: Int
        get() = _size
    override val isEmpty: Boolean
        get() = head == null

    override fun dequeue(): T? {
        val deq = head?.data
        head = head?.next
        _size--
        return deq
    }

    override val rear: T?
        get() = tail?.data
    override val peak: T?
        get() = head?.data

    override fun enqueue(t: T) {

        val inserted = QNode(t)
        if (head != null) {
            tail?.next = inserted
            tail = tail?.next
        } else {
            head = inserted
            tail = head
        }
        _size++
    }


}

fun main() {
    val queue = MyLinkedQueue<Int>().apply {
        enqueue(1)
        enqueue(12)
        enqueue(213)
        enqueue(123213)
        enqueue(213123213)
        enqueue(909)
    }
    val peak = queue.peak
    println(peak)
    val deq = queue.dequeue()
    println(deq)
    println(queue.peak)
}