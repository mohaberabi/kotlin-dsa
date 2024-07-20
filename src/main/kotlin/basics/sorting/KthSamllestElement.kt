package basics.sorting

import core.swap


fun kthSmallestElementInArrayNaive(

    arr: Array<Int>,
    k: Int
): Int {

    arr.sort()
    return arr[k - 1]
}


fun kthSmallestEleemntUsingQuickSort(
    k: Int,
    arr: Array<Int>
): Int {

    var low = 0
    var high = arr.lastIndex
    while (low <= high) {

        val pivot = lumeto(low, high, arr)
        if (pivot == k - 1) {
            return arr[pivot]
        } else if (pivot > k - 1) {
            high = pivot - 1
        } else {
            low = pivot + 1
        }
    }
    return -1
}


fun lumeto(
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