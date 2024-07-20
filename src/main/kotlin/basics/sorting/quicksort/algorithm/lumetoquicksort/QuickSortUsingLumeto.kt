package basics.sorting.quicksort.algorithm.lumetoquicksort

import core.swap


private fun quickSort(
    low: Int = 0,
    arr: Array<Int>,
    high: Int = arr.lastIndex
) {

    if (high > low) {
        val pivot = partitionUsingLumeto(
            low = low,
            high = high,
            arr = arr,
        )
        quickSort(
            low = low,
            high = pivot - 1,
            arr = arr
        )
        quickSort(
            low = pivot + 1,
            high = high,
            arr = arr
        )
    }

}

private fun partitionUsingLumeto(
    low: Int,
    high: Int,
    arr: Array<Int>
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

private fun main() {
    val arr = arrayOf(9082139, 122, 0, -20, 90, 9, 0, 12, 2, 482, 1)
    quickSort(arr = arr)
    for (x in arr) {
        print("${x} ")
    }
}