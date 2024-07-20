package basics.queue.design

class MyListQueue<T> : MyQueue<T> {


    private val queue = mutableListOf<T>()


    override val size: Int
        get() = queue.size
    override val isEmpty: Boolean
        get() = queue.isEmpty()

    override fun dequeue(): T? {
        return if (queue.isNotEmpty()) {
            queue.removeAt(0)
        } else {
            null
        }

    }

    override val rear: T?
        get() = if (isEmpty) null else queue[size - 1]
    override val peak: T?
        get() = queue.firstOrNull()

    override fun enqueue(t: T) {
        queue.add(t)
    }

}