package basics.sorting.mergesort.algorithm


private fun mergeSort(

    arr: Array<Int>,
    low: Int = 0,
    high: Int = arr.lastIndex
) {
    if (high > low) {
        val mid = (high + low) / 2
        mergeSort(arr, low, mid)
        mergeSort(arr, mid + 1, high)
        merge(low = low, mid = mid, high = high, arr = arr)
    }
}

private fun merge(
    low: Int,
    mid: Int,
    high: Int,
    arr: Array<Int>,
) {

    val n = mid - low + 1
    val m = high - mid
    val left = IntArray(n)
    val right = IntArray(m)

    for (i in 0..<n) {
        left[i] = arr[low + i]
    }
    for (i in 0..<m) {

        right[i] = arr[mid + i + 1]
    }

    var leftIndex = 0
    var rightIndex = 0
    var mergedIndex = low

    while (leftIndex < n && rightIndex < m) {
        if (left[leftIndex] <= right[rightIndex]) {
            arr[mergedIndex++] = left[leftIndex++]
        } else {
            arr[mergedIndex++] = right[rightIndex++]
        }
    }

    while (leftIndex < n) {
        arr[mergedIndex++] = left[leftIndex++]
    }
    while (rightIndex < m) {
        arr[mergedIndex++] = right[rightIndex++]

    }
}

fun main() {
    val arr1 = arrayOf(10123123, 0, -1, -90, 213, -9, 0, 100, 200, Int.MIN_VALUE)

    mergeSort(arr1)

    for (i in arr1) {
        print("${i} ")
    }
}