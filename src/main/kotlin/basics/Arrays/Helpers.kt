package basics.Arrays


fun Array<Int>.reverse(
    start: Int,
    end: Int
) {

    var i = start
    var j = end
    while (start < end) {
        swap(
            i,
            j,
        )
        i++
        j--
    }
}

fun Array<Int>.swap(
    left: Int,
    right: Int,
) {
    val temp = this[left]
    this[left] = this[right]
    this[right] = temp
}