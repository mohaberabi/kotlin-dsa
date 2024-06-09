package basics.sorting.quicksort.algorithm.quicksortinpractice

import shared.swap
import kotlin.random.Random


private fun quickSort(
    arr: Array<Int>,
) {

    val random = Random.nextInt(arr.size)
    swap(random, arr.lastIndex, arr)
    quickSort(
        arr = arr,
        low = 0,
        high = arr.lastIndex,
    )

}

private fun quickSort(
    low: Int,
    arr: Array<Int>,
    high: Int,
) {

    if (high > low) {
        val pivot = lumeto(low, high, arr)
        quickSort(low = low, high = pivot - 1, arr = arr)
        quickSort(low = pivot + 1, high = high, arr = arr)
    }
}

private fun lumeto(
    low: Int,
    high: Int,
    arr: Array<Int>,
): Int {
    val pivot = arr[high]
    var i = low - 1
    for (j in low..<high) {
        if (arr[j] < pivot) {
            i++
            swap(i, j, arr)
        }
    }

    swap(i + 1, high, arr)
    return i + 1

}


fun main() {
    val arr = arrayOf(9082139, 122, 0, -20, 90, 9, 0, 12, 2, 482, 1)
    quickSort(arr = arr)
    for (x in arr) {
        print("${x} ")
    }
}