package basics.sorting.mergesort.merge


private fun merge(

    arr: Array<Int>,
    low: Int,
    mid: Int,
    high: Int,
) {

    val n = mid - low + 1
    val m = high - mid

    val left = IntArray(n)
    val right = IntArray(m)
    for (i in 0..<n) {
        left[i] = arr[low + i]
    }
    for (i in 0..<m) {
        right[i] = arr[mid + 1 + i]
    }


    var i = 0
    var j = 0
    var k = low


    while (i < n && j < m) {
        if (left[i] <= right[j]) {
            arr[k++] = left[i++]
        } else {
            arr[k++] = right[j++]
        }
    }

    while (i < n) {
        arr[k++] = left[i++]

    }
    while (j < m) {
        arr[k++] = right[j++]

    }
}