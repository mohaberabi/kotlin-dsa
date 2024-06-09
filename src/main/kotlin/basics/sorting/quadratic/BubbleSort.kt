package basics.sorting.quadratic

private fun bubbleSort3(
    arr: Array<Int>
) {


    for (i in 0..<arr.size - 1) {

        var swapped = false
        for (j in 0..<arr.size - i - 1) {
            if (arr[j] > arr[j + 1]) {
                swap(j, j + 1, arr)
                swapped = true
            }
        }
        if (!swapped) {
            return
        }
    }
}

private fun bubbleSort2(
    arr: Array<Int>
) {


    for (i in 0..<arr.size - 1) {

        for (j in 0..<arr.size - i - 1) {

            if (arr[j] > arr[j + 1]) {
                swap(j, j + 1, arr)
            }
        }
    }
}

private fun bubbleSort(
    arr: Array<Int>
) {


    for (i in 0..<arr.size - 1) {

        for (j in 0..<arr.size - 1) {

            if (arr[j] > arr[j + 1]) {
                swap(j, j + 1, arr)
            }
        }
    }
}


private fun swap(
    i: Int,
    j: Int,
    arr: Array<Int>
) {


    val temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp


}


fun main() {

    val arr1 = arrayOf(10123123, 0, -1, -90, 213, -9, 0, 100, 200, Int.MIN_VALUE)
    val arr2 = arrayOf(10123123, 0, -1, -90, 213, -9, 0, 100, 200, 201098)
    val arr3 = arrayOf(Int.MAX_VALUE, 10123123, 0, -1, -90, 213, -9, 0, 100, 200)

    bubbleSort(arr1)
    for (x in arr1) {
        print("${x} ")
    }
    println()
    bubbleSort2(arr2)
    for (x in arr2) {
        print("${x} ")
    }
    println()
    bubbleSort3(arr3)
    for (x in arr3) {
        print("${x} ")
    }

}