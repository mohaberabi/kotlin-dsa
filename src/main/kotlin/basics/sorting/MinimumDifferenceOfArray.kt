package basics.sorting

import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min


fun minDifferenceOptimal(
    arr: Array<Int>,
): Int {

    arr.sort()

    var res = Int.MAX_VALUE


    for (i in 0..<arr.size - 1) {
        val curr = arr[i + 1] - arr[i]
        res = min(res, curr)
    }
    return res
}

fun minDifferenceInArray(
    arr: Array<Int>
): Int {
    var res = Int.MAX_VALUE
    for (i in 1..<arr.size) {
        for (j in 0..<i) {
            res = min(res, abs(arr[j] - arr[i]))
        }
    }
    return res
}


fun main() {
    val arr = arrayOf(10, 8, 1, 4)
    val res = minDifferenceOptimal(arr)
    println(res)
}