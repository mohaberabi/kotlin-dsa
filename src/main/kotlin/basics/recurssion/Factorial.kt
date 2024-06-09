package basics.recurssion


private fun factorial(n: Int): Int {
    if (n == 0 || n == 1) {
        return 1
    }
    return factorial(n - 1) * n
}

private tailrec fun factorial(
    n: Int,
    k: Int = 1
): Int {

    return if (n == 0 || n == 1) {
        k
    } else {
        factorial(n - 1, k * n)
    }

}