package basics.Arrays


fun reverseArray(
    arr: Array<Int>
) {

    var left = 0
    var right = arr.size - 1

    while (left < right) {
        arr.swap(left, right)
        left++
        right--
    }
}

