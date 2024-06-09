package basics.sorting


fun unionOfTwoSortedArraysNaive(
    arr1: Array<Int>,
    arr2: Array<Int>
): List<Int> {
    val res = mutableListOf<Int>()
    res.addAll(arr1.toSet())
    res.addAll(arr2.toSet())
    res.sort()
    return res.toSet().toList()
}


fun unionOfTwoSortedArraysOptimal(
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
        if (j > 0 && arr2[j] == arr2[j - 1]) {
            j++
            continue
        }
        if (arr1[i] < arr2[j]) {
            res.add(arr1[i++])
        } else if (arr2[j] < arr1[i]) {
            res.add(arr2[j++])
        } else {
            res.add(arr1[i])
            i++
            j++
        }


    }
    while (i < n) {
        if (i > 0 && arr1[i] != arr1[i - 1]) {
            res.add(arr1[i])
        }
        i++
    }
    while (j < m) {
        if (j > 0 && arr2[j] != arr2[j - 1]) {
            res.add(arr2[j])
        }
        j++
    }
    return res
}

fun main() {
    val arr1 = arrayOf(10, 20, 20)
    val arr2 = arrayOf(5, 20, 40, 40)
    val res = unionOfTwoSortedArraysOptimal(arr1, arr2)

    for (x in res) {
        print("${x} ")
    }
}