package basics.stack.design


class MyListStack<T> : MyStack<T> {
    private val stack = mutableListOf<T>()
    override fun pop(): T? {
        return if (stack.isEmpty()) {
            null
        } else {
            stack.removeAt(stack.size - 1)
        }
    }

    override val isEmpty: Boolean
        get() = stack.isEmpty()
    override val size: Int
        get() = stack.size
    override val top: T?
        get() = if (stack.isNotEmpty()) stack.last() else null

    override fun push(t: T) {
        stack.add(t)
    }

}

fun main() {
    val stack = MyListStack<String>().apply {
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