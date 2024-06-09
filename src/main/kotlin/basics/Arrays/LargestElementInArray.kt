package basics.Arrays

import kotlin.math.max


private fun getLargestElementInArray(
    array: Array<Int>
): Int {


    var res = Int.MIN_VALUE

    for (num in array) {
        res = max(res, num)
    }
    return res
}


fun main() {

    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 10000)
    val res = getLargestElementInArray(array)
    println(res)
}