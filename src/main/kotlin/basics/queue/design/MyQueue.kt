package basics.queue.design

interface MyQueue<T> {
    val size: Int
    val isEmpty: Boolean
    fun enqueue(t: T)
    fun dequeue(): T?
    val peak: T?
    val rear: T?

}