package basics.sorting.quicksort.partition.naive


private fun naiveParitionForQuickSort(
    arr: Array<Int>,
    low: Int,
    high: Int,
    pivotIndex: Int,
) {
    val temp = IntArray(arr.size)
    var index = 0
    val pivot = arr[pivotIndex]
    for (i in low..high) {

        if (arr[i] <= pivot) {
            temp[index++] = arr[i]
        }
    }
    for (i in low..high) {

        if (arr[i] > pivot) {
            temp[index++] = arr[i]
        }
    }

    for (i in low..high) {
        arr[i] = temp[i - low]
    }


}


fun main() {


    val arr = arrayOf(5, 13, 6, 9, 12, 11, 8)
    val pivot = 6 // index of 8

    naiveParitionForQuickSort(
        arr = arr,
        pivotIndex = pivot,
        high = arr.size - 1,
        low = 0
    )

    for (x in arr) {
        print("${x} ")
    }

}