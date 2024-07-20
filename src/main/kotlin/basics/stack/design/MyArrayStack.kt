package basics.stack.design


class MyArrayStack<T>(
    private val capacity: Int = 50,
) : MyStack<T> {
    private var _top = -1
    private var _size = 0
    private val stack = arrayOfNulls<Any>(capacity) as Array<T>
    override fun pop(): T? {
        return if (stack.isEmpty()) {
            null
        } else {
            _size--
            stack[_top--]
        }
    }

    override val top: T?
        get() = stack.firstOrNull()

    override val isEmpty: Boolean
        get() = _top == -1

    override val size: Int
        get() = _size

    override fun push(t: T) {
        if (_size == capacity) {
            throw IllegalStateException("Stack is full")
        } else {
            _size++
            stack[++_top] = t
        }

    }


}

fun main() {


    val stack = MyArrayStack<Int>().apply {
        push(1)
        push(2)
        push(3)
        push(4)
        push(5)
    }

    val top = stack.top
    println(top)
    val size = stack.size
    println(size)


}