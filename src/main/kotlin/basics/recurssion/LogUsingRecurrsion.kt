package basics.recurssion


fun log(num: Int): Int {
    return if (num == 1) {
        0
    } else {
        1 + log(num / 2)
    }
}
