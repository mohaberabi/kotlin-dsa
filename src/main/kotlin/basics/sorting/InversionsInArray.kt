package basics.sorting


fun inversionsInArray(
    arr: Array<Int>
): Int {
    var res = 0

    for (i in arr.indices) {
        for (j in i + 1..<arr.size) {
            if (arr[j] > arr[i]) {
                res++
            }
        }
    }
    return res
}

private fun countInversionsUsingMergeSort(
    arr: Array<Int>,
    low: Int = 0,
    high: Int = arr.lastIndex,
): Int {
    var res = 0
    if (high > low) {
        val mid = (high + low) / 2
        res += countInversionsUsingMergeSort(arr, low, mid)
        res += countInversionsUsingMergeSort(arr, mid + 1, high)
        res += countAndMerge(low, mid, high, arr)
    }
    return res
}

private fun countAndMerge(
    low: Int,
    mid: Int,
    high: Int,
    arr: Array<Int>
): Int {
    val n = mid - low + 1
    val m = high - mid
    val left = IntArray(n)
    val right = IntArray(m)

    for (i in 0..<n) {
        left[i] = arr[i + low]
    }
    for (i in 0..<m) {

        right[i] = arr[mid + 1 + low]
    }

    var i = 0
    var j = 0
    var k = 0
    var res = 0
    while (i < n && j < m) {
        if (left[i] <= right[j]) {
            arr[k++] = left[i++]
        } else {
            arr[k++] = right[j++]
            res += (n - i)
        }
    }

    while (i < n) {
        arr[k++] = left[i++]

    }
    while (j < m) {
        arr[k++] = right[j++]

    }
    return res
}