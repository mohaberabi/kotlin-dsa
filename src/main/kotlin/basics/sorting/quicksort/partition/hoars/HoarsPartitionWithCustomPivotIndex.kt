package basics.sorting.quicksort.partition.hoars

private fun hoarsParition(

    low: Int,
    high: Int,
    pivotIndex: Int,
    arr: Array<Int>
): Int {

    swap(pivotIndex, low, arr)
    return hoarsParition(low = low, high = high, arr = arr)
}


private fun hoarsParition(

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

private fun swap(i: Int, j: Int, arr: Array<Int>) {
    val temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}