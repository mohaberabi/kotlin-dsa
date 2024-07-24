package advanced.math


private fun isNoPalindrome(
    no: Int
): Boolean {


    var n = no
    var rev = 0
    while (n != 0) {
        val last = (n % 10)
        rev = rev * 10 + last
        n /= 10
    }
    return no == rev
}

private fun isNoPalindrome2(
    no: Int
): Boolean {
    val n = no.toString()
    val rev = n.reversed()
    return n == rev
}

private fun isNoPalindrome3(
    no: Int
): Boolean {
    val n = no.toString()
    var i = 0
    var j = n.length - 1
    while (i < j) {
        if (n[i] != n[j]) {
            return false
        }
        i++
        j--
    }
    return true
}

private fun isNoPalindrome4(
    no: Int
): Boolean {
    val n = no.toString()
    val rev = n.toCharArray()
    var i = 0
    var j = n.length - 1
    while (i < j) {
        val c = rev[i]
        rev[i] = rev[j]
        rev[j] = c
        i++
        j--
    }
    return String(rev) == n
}

fun main() {
    val n = 999

    println(isNoPalindrome(n))
    println(isNoPalindrome2(n))

    println(isNoPalindrome3(n))
    println(isNoPalindrome4(n))


}