package basics.sorting.quadratic


fun insertionSort(
    arr: Array<Int>,
) {

    for (right in 1..<arr.size) {

        val key = arr[right]
        var left = right - 1
        while (left >= 0 && arr[left] > key) {
            arr[left + 1] = arr[left]
            left--
        }
        arr[left + 1] = key
    }
}


fun main() {

    val arr1 = arrayOf(10123123, 0, -1, -90, 213, -9, 0, 100, 200, Int.MIN_VALUE)

    insertionSort(arr1)
    for (x in arr1) {
        print("${x} ")
    }


}
