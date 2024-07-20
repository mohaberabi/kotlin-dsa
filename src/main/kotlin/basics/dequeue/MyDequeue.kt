package basics.dequeue

interface MyDequeue<T> {


    fun addRear(t: T)
    fun addFront(t: T)
    fun deleteFront(): T?
    fun deleteRear(): T?
    fun front(): T?
    fun rear(): T?
    fun isEmpty(): Boolean
    fun size(): Int

}