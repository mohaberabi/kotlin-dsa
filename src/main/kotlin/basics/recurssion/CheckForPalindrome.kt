package basics.recurssion


private fun palindrome(
    s: String,
    start: Int,
    end: Int
): Boolean {

    if (start >= end) {
        return true
    }

    val curr = s[start] == s[end]

    return curr && palindrome(s, start + 1, end - 1)
}