package advanced.math

import kotlin.math.max


private fun lcm(
    a: Int,
    b: Int,
): Int {

    val gcd = gcd(a, b)
    return (a * b) / gcd
}

private fun lcmNaive(
    a: Int,
    b: Int,
): Int {

    var res = max(a, b)
    while (true) {
        if (res % a == 0 && res % b == 0) {
            return res
        }
        res++
    }

}

private fun gcd(
    a: Int,
    b: Int,
): Int {

    return if (b == 0) {
        a
    } else {
        gcd(b, a % b)
    }
}