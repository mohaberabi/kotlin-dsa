package basics.sorting

import core.swap


// naive partition function of quicksort

private fun segragatePositvieAndNegativeNaive(
    arr: Array<Int>

) {

    val temp = IntArray(arr.size)
    var index = 0
    for (i in arr.indices) {
        if (arr[i] < 0) {
            temp[index++] = arr[i]
        }
    }

    for (i in arr.indices) {
        if (arr[i] > 0) {
            temp[index++] = arr[i]
        }
    }

    for (i in temp.indices) {
        arr[i] = temp[i]
    }


}


private fun segragatePositiveAndNegativeOptimalLumeto(
    arr: Array<Int>,
) {
    val low = 0
    val high = arr.lastIndex
    var i = low - 1
    val pivot = 0
    for (j in low..<high) {
        if (arr[j] < pivot) {
            i++
            swap(i, j, arr)
        }
    }
    swap(i + 1, high, arr)
}

private fun segragatePositiveAndNegativeOptimalHoars(
    arr: Array<Int>,
) {
    val low = 0
    var i = low - 1
    val high = arr.lastIndex
    var j = high + 1
    val pivot = 0
    while (true) {
        do {
            i++
        } while (arr[i] < pivot)

        do {
            j--
        } while (arr[j] >= pivot)
        if (i >= j) {
            return
        }
        swap(i, j, arr)
    }
}

fun main() {
    val arr = arrayOf(90, 100, 909082, -1, 90, -20, -50, 100, -876)
    segragatePositiveAndNegativeOptimalLumeto(arr)
    for (x in arr) {
        print("${x} ")
    }
}