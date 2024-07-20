package basics.queue.design

class MyArrayQueue<T>(
    private val capacity: Int = 50
) : MyQueue<T> {
    private var _size = 0
    private val queue = arrayOfNulls<Any>(capacity) as Array<T>
    override val size: Int
        get() = _size
    override val isEmpty: Boolean
        get() = _size == 0

    override fun dequeue(): T? {

        return if (isEmpty) {
            null
        } else {
            val deq = queue[0]
            for (i in 0..<queue.size - 1) {
                queue[i] = queue[i + 1]
            }
            _size--
            deq
        }
    }


    override val rear: T?
        get() = if (isEmpty) null else queue[size - 1]
    override val peak: T?
        get() = queue.firstOrNull()

    override fun enqueue(t: T) {
        if (full()) {
            throw IllegalStateException("Queue is full")
        } else {
            queue[_size++] = t
        }
    }

    private fun full() = capacity == _size
}

fun main() {
    val queue = MyArrayQueue<Int>().apply {
        enqueue(1)
        enqueue(100)
        enqueue(200)
    }
    println(queue.peak)
    println(queue.rear)
    println(queue.dequeue())
    println(queue.size)
    println(queue.peak)


}