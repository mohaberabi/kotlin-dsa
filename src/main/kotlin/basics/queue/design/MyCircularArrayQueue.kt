package basics.queue.design


class MyCircularArrayQueue<T>(
    private val capacity: Int = 50,
) : MyQueue<T> {
    private var frontIndex = 0
    private var rearIndex = capacity - 1
    private val queue = arrayOfNulls<Any>(capacity) as Array<T>
    private var _size = 0


    override fun dequeue(): T? {
        return if (isEmpty) {
            null
        } else {
            val deq = queue[frontIndex]
            frontIndex = (frontIndex + 1) % capacity
            _size--
            deq
        }
    }

    override val peak: T?
        get() = if (isEmpty) null else queue[frontIndex]
    override val rear: T?
        get() = if (isEmpty) null else queue[this.rearIndex]

    override fun enqueue(t: T) {

        if (full()) {
            throw IllegalStateException("Queue is full")
        } else {
            rearIndex = (rearIndex + 1) % capacity
            queue[rearIndex] = t
            _size++
        }
    }

    override val size: Int
        get() = _size
    override val isEmpty: Boolean
        get() = _size == 0

    private fun full() = _size == capacity

}