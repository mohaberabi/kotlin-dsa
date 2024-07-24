package advanced.math


private fun factorialRec(n: Int): Int {

    if (n == 0 || n == 1) {
        return 1
    }
    return factorialRec(n - 1) * n
}

private fun factorial(n: Int): Int {
    var res = 1
    for (i in n.downTo(1)) {
        res *= i
    }
    return res
}

private fun factorial2(n: Int): Int {
    var res = 1
    for (i in 2..n) {
        res *= i
    }
    return res
}


fun main() {
    val n = 4
    println(factorial(n))
    println(factorial2(n))

    println(factorialRec(n))

}