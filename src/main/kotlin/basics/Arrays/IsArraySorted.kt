package basics.Arrays

private fun isArraySortedNaive2(
    arr: Array<Int>
): Boolean {

    for (i in arr.indices) {


        for (j in 1..<arr.size) {

            if (arr[j] < arr[i]) {
                return false
            }
        }


    }

    return true
}

private fun isArraySortedNaive(
    arr: Array<Int>
): Boolean {

    for (i in arr.indices) {


        for (j in 1..arr.size - 1) {

            if (arr[j] < arr[i]) {
                return false
            }
        }


    }

    return true
}

private fun isArraySorted(
    arr: Array<Int>
): Boolean {

    for (i in arr.indices - 1) {

        val curr = arr[i]
        val next = arr[i + 1]
        if (next < curr) {
            return false
        }
    }
    return true
}


fun main() {
    val arr = arrayOf(1, 2, 3, 4 - 100, 90)
    val res = isArraySorted(arr)
    val resNaive = isArraySortedNaive(arr)
    println(res)
    println(resNaive)
}