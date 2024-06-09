package basics.sorting.quicksort.partition.lumeto


private fun swap(i: Int, j: Int, arr: Array<Int>) {
    val temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}

private fun lumeto(

    low: Int,
    high: Int,
    pivotIndex: Int,
    arr: Array<Int>
): Int {


    swap(pivotIndex, high, arr)

    return lumeto(low, high, arr)
}

private fun lumeto(

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

fun main() {
    val arr = arrayOf(10, 80, 30, 90, 40, 50, 70)

    val customPivotIndex = 2

    val newPivotIndex = lumeto(
        low = 0,
        pivotIndex = customPivotIndex,
        high = arr.lastIndex,
        arr = arr
    )

    for (i in arr) {
        print("${i} ")
    }
}