package advanced.math


private fun trailingZerosInFactorialNaive(n: Int): Int {

    var fact = 1

    for (i in 2..n) {
        fact *= i
    }
    var res = 0

    while (fact % 10 == 0) {
        res++
        fact /= 10
    }
    return res
}

private fun trailingZerosInFactorialEiecient(n: Int): Int {
    var res = 0

    generateSequence(5) { it * 5 }
        .takeWhile { it <= n }
        .forEach { res += (n / it) }
    return res
}

fun main() {
    val n = 251
    println(trailingZerosInFactorialNaive(n))
    println(trailingZerosInFactorialEiecient(n))

}