package basics.sorting.quadratic

import basics.Arrays.swap


private fun selectionSort1(
    arr: Array<Int>
) {

    val temp = IntArray(arr.size)
    for (i in arr.indices) {
        var minIndex = 0
        for (j in 1..<arr.size) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j
            }
        }
        temp[i] = arr[minIndex]
        arr[minIndex] = Int.MAX_VALUE
    }
    for (i in temp.indices) {
        arr[i] = temp[i]
    }

}

private fun selectionSort2(
    arr: Array<Int>
) {
    for (i in arr.indices) {
        var min = i
        for (j in i + 1..<arr.size) {
            if (arr[j] < arr[min]) {
                min = j
            }
        }
        arr.swap(min, i)
    }
}

fun main() {

    val arr1 = arrayOf(10123123, 0, -1, -90, 213, -9, 0, 100, 200, Int.MIN_VALUE)
    val arr2 = arrayOf(10123123, 0, -1, -90, 213, -9, 0, 100, 200, Int.MIN_VALUE)

    selectionSort1(arr1)
    for (x in arr1) {
        print("${x} ")
    }
    println()
    selectionSort2(arr2)
    for (x in arr2) {
        print("${x} ")
    }


}
