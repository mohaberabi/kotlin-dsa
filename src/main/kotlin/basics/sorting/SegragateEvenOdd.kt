package basics.sorting

import core.swap


private fun segragateOddEvenNaive(

    arr: Array<Int>
) {
    val temp = IntArray(arr.size)

    var index = 0
    for (i in arr.indices) {
        if (arr[i] % 2 != 0) {
            temp[index++] = arr[i]
        }
    }
    for (i in arr.indices) {
        if (arr[i] % 2 == 0) {
            temp[index++] = arr[i]
        }
    }
    for (i in temp.indices) {
        arr[i] = temp[index]
    }
}

private fun segragateOddEvenLumeto(
    arr: Array<Int>,
) {
    val low = 0
    val high = arr.lastIndex
    var i = low - 1
    for (j in low..<high) {
        if (arr[j] % 2 != 0) {
            i++
            swap(i, j, arr)
        }
    }
    swap(i + 1, high, arr)

}

private fun segragateOddEvenHoars(
    arr: Array<Int>,
) {
    val low = 0
    val high = arr.lastIndex
    var i = low - 1
    var j = high + 1

    while (true) {
        do {
            i++
        } while (arr[i] % 2 != 0)
        do {
            j--
        } while (arr[j] % 2 == 0)
        if (i >= j) {
            return
        }
        swap(i, j, arr)
    }

}

fun main() {
    val arr = arrayOf(2, 1, 4, 3, 6, 9, 12, 15, 16)
    segragateOddEvenLumeto(arr)
    for (x in arr) {
        print("${x} ")
    }
}