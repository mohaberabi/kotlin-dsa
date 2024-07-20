package basics.dequeue

class MyCircularDequeue<T>(
    private val capacity: Int = 50
) : MyDequeue<T> {
    private var head: Int = -1
    private var tail: Int = -1

    private val queue: Array<Any?> = arrayOfNulls<Any?>(capacity)


    override fun addRear(t: T) {
        if (isFull()) return
        if (isEmpty()) {
            head = 0
            tail = 0
        } else {
            tail = (tail + 1) % capacity
            queue[tail] = t
        }
    }

    override fun addFront(t: T) {

        if (isFull()) return
        if (isEmpty()) {
            head = 0
            tail = 0
        } else {
            head = if (head == 0) capacity - 1 else head - 1
        }
        queue[head] = t
    }

    override fun deleteFront(): T? {

        return if (isEmpty()) {
            null
        } else {
            val data = queue[head] as T?
            if (head == tail) {
                head = -1
                tail = -1
            } else {
                head = (head + 1) % capacity
            }
            data
        }
    }

    override fun deleteRear(): T? {
        if (isEmpty()) return null
        val data = queue[tail] as? T
        if (head == tail) {
            head = -1
            tail = -1
        } else {
            tail = if (tail == 0) capacity - 1 else tail - 1
        }
        return data
    }

    override fun front(): T? = if (isEmpty()) null else queue[head] as? T

    override fun rear(): T? = if (isEmpty()) null else queue[tail] as? T
    private fun isFull(): Boolean = size == capacity


    override fun isEmpty(): Boolean = size == 0

    val size: Int
        get() = if (head == -1) 0 else if (tail >= head) tail - head + 1 else capacity - head + tail + 1

    override fun size(): Int = size
}