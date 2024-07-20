package basics.sorting.quicksort.algorithm.hoarsquicksort

import core.swap


private fun quickSort(
    low: Int = 0,
    arr: Array<Int>,
    high: Int = arr.lastIndex,
) {
    if (high > low) {
        val pivot = paritionUsingHoars(low = low, high = high, arr = arr)
        quickSort(low = low, high = pivot, arr = arr)
        quickSort(low = pivot + 1, high = high, arr = arr)
    }
}


private fun paritionUsingHoars(
    low: Int,
    high: Int,
    arr: Array<Int>
): Int {

    val pivot = arr[low]

    var i = low - 1
    var j = high + 1

    while (true) {
        do {
            i++
        } while (arr[i] < pivot)
        do {
            j--
        } while (arr[j] > pivot)
        if (i >= j) {
            return j
        }
        swap(i, j, arr)
    }
}

private fun main() {
    val arr = arrayOf(9082139, 122, 0, -20, 90, 9, 0, 12, 2, 482, 1)
    quickSort(arr = arr)
    for (x in arr) {
        print("${x} ")
    }
}