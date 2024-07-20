package basics.stack.design


private data class StackNode<T>(
    val data: T,
    var next: StackNode<T>? = null
)

class MyLinkedStack<T> : MyStack<T> {
    private var head: StackNode<T>? = null
    private var _size = 0
    override fun pop(): T? {
        return if (head == null) {
            null
        } else {
            _size--
            val poped = head?.data
            head = head?.next
            poped
        }
    }

    override val isEmpty: Boolean
        get() = head == null
    override val size: Int
        get() = _size
    override val top: T?
        get() = head?.data

    override fun push(t: T) {
        val inserted = StackNode(t)
        inserted.next = head
        head = inserted
        _size++
    }


}

fun main() {
    val stack = MyLinkedStack<String>().apply {
        push("M")
        push("O")
        push("H")
        push("A")
        push("B")
    }

    val mohab = "MOHAB".reversed()
    var res = ""
    while (!stack.isEmpty) {
        res += stack.pop()
    }

    println(res == mohab)
}