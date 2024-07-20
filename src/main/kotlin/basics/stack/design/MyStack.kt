package basics.stack.design

interface MyStack<T> {


    fun pop(): T?

    fun push(t: T)

    val isEmpty: Boolean

    val size: Int
    val top: T?

}