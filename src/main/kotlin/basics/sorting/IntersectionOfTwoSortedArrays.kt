package basics.sorting


private fun intersectionOfTwoSortedArraysNaive(
    arr1: Array<Int>,
    arr2: Array<Int>
): List<Int> {
    val res = mutableListOf<Int>()

    for (i in arr1.indices) {
        if (i > 0 && arr1[i] == arr1[i - 1]) {
            continue
        }
        for (j in arr2.indices) {
            if (arr1[i] == arr2[j]) {
                res.add(arr1[i])
                break
            }
        }
    }
    return res
}

// values that are exist in both of them
private fun intersectionsOfTwoSortedArray(
    arr1: Array<Int>,
    arr2: Array<Int>
): List<Int> {


    val res = mutableListOf<Int>()

    var i = 0
    var j = 0

    val n = arr1.size
    val m = arr2.size

    while (i < n && j < m) {

        if (i > 0 && arr1[i] == arr1[i - 1]) {
            i++
            continue
        }
        if (arr1[i] < arr2[j]) {
            i++
        } else if (arr2[j] < arr1[i]) {
            j++
        } else {
            res.add(arr1[i])
            i++
            j++
        }
    }


    return res
}

fun main() {

    val arr1 = arrayOf(3, 5, 10, 10, 10, 15, 15, 20)
    val arr2 = arrayOf(5, 10, 10, 15, 30)
    val res = intersectionsOfTwoSortedArray(arr1, arr2)
    for (x in res) {
        print("${x} ")
    }
}