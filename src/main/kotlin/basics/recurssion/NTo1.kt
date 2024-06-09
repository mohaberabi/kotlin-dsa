package basics.recurssion


private tailrec fun nTo1(n: Int) {

    if (n == 0) {
        return
    }
    println(n)
    nTo1(n - 1)
}

private fun oneToN(n: Int) {
    if (n == 0) {
        return
    }
    oneToN(n - 1)
    println(n)
}

fun main() {

    nTo1(10)
}