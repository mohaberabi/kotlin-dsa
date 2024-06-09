package basics.sorting.mergesort.merge


fun mergeTwoSortedArrays(
    arr1: Array<Int>,
    arr2: Array<Int>
): Array<Int> {

    val n = arr1.size
    val m = arr2.size
    val size = n + m
    val res = IntArray(size)
    var i = 0
    var j = 0
    var index = 0


    while (i < n && j < m) {
        if (arr1[i] <= arr2[j]) {
            res[index] = arr1[i++]
        } else {
            res[index] = arr2[j++]
        }
        index++


    }

    while (i < n) {
        res[index++] = arr1[i++]
    }
    while (j < m) {
        res[index++] = arr2[j++]
    }

    return res.toTypedArray()
}

fun main() {

    val arr1 = arrayOf(0, 2, 4, 6, 8, 10, 11, 12, 13, 14)
    val arr2 = arrayOf(1, 3, 5, 7, 9)
    val res = mergeTwoSortedArrays(arr1, arr2)
    for (x in res) {
        print("${x} ")
    }
}