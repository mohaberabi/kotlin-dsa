package basics.recurssion


private fun sumOfnNatural(
    n: Int
): Int {

    if (n == 0) {
        return 0
    }
    return n + sumOfnNatural(n - 1)
}