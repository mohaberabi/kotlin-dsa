package basics.dequeue

class MyArrayDeque<T>(
    private val capacity: Int = 50,
) : MyDequeue<T> {
    private var size = 0
    private var frontIndex = 0

    private var rearIndex = size - 1
    private val queue = arrayOfNulls<Any>(capacity) as Array<T>

    override fun rear(): T? = queue.elementAtOrNull(size - 1)
    override fun addRear(t: T) {
        if (!full) {
            queue[size++] = t
        }
    }

    override fun deleteRear(): T? {
        return if (isEmpty()) {
            null
        } else {
            val deq = queue[size]
            size--
            deq
        }
    }

    override fun front(): T? = queue.elementAtOrNull(0)
    override fun addFront(t: T) {
        if (!full) {
            for (i in queue.size - 1 downTo 0) {
                queue[i + 1] = queue[i]
            }
            queue[0] = t
            size++
        }
    }

    override fun deleteFront(): T? {

        return if (isEmpty()) {
            null
        } else {
            val deq = queue[0]
            for (i in 0..<queue.size - 1) {
                queue[i] = queue[i]
            }
            size--
            deq
        }
    }

    override fun isEmpty(): Boolean = size == 0

    override fun size(): Int = queue.size

    private val full: Boolean
        get() = capacity == size
}