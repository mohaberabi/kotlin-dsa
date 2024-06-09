package basics.sorting.quicksort.partition.hoars


private fun hoarsPartition(
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

fun main() {
    val arr = arrayOf(10, 80, 30, 90, 40, 50, 70)

    val newPivot = hoarsPartition(arr = arr, low = 0, high = arr.lastIndex)
    println(newPivot)
    for (i in arr) {
        print("${i} ")
    }
}