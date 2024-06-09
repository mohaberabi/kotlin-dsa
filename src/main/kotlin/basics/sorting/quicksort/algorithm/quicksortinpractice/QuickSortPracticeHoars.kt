package basics.sorting.quicksort.algorithm.quicksortinpractice

import shared.swap
import kotlin.random.Random


private fun quickSort(
    arr: Array<Int>
) {
    val random = Random.nextInt(arr.size)
    swap(random, 0, arr)
    quickSort(
        arr = arr,
        low = 0,
        high = arr.lastIndex
    )
}


private fun quickSort(
    low: Int,
    arr: Array<Int>,
    high: Int,
) {

    if (high > low) {
        val pivot = hoars(low = low, high = high, arr = arr)
        quickSort(low = low, high = pivot, arr = arr)
        quickSort(low = pivot + 1, high = high, arr = arr)
    }
}

private fun hoars(
    low: Int,
    arr: Array<Int>,
    high: Int,
): Int {


    var i = low - 1
    var j = high + 1
    val pivot = arr[low]

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

fun main() {
    val arr = arrayOf(9082139, 122, 0, -20, 90, 9, 0, 12, 2, 482, 1)
    quickSort(arr = arr)
    for (x in arr) {
        print("${x} ")
    }
}