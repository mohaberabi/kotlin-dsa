package advanced.math


private fun countDigits(
    n: Int
): Int {


    var no = n
    var res = 0
    while (no > 0) {
        no /= 10
        res++
    }
    return res
}


fun main() {
    val no = 9234
    val res = countDigits(no)
    println(res)
}