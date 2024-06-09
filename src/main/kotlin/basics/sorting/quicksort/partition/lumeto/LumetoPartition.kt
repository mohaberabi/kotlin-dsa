package basics.sorting.quicksort.partition.lumeto


private fun lumeto(
    arr: Array<Int>,
    low: Int,
    high: Int
): Int {
    // [pivot] getting the actual pivot we are partition around it and store it in a variable
    val pivot = arr[high]
    //[i] this pointer is meant to be the bound of the lower elements windowo of the pivot
    // it is initialized as [low-1] as at initial window is still empty */
    var i = low - 1
    for (j in low..<high) {
        //if arr[j]<[pivot] increment the window and swap
        if (arr[j] < pivot) {
            i++
            swap(i, j, arr)
        }
    }
    // fix the pivot at it's new place
    swap(i + 1, high, arr)
    // return the new index of the pivot so that quick sort re partition around the new index again
    return i + 1
}


private fun swap(i: Int, j: Int, arr: Array<Int>) {

    val temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}

fun main() {
    val arr = arrayOf(10, 80, 30, 90, 40, 50, 70)
    val newPivot = lumeto(arr = arr, low = 0, high = arr.lastIndex)
    for (i in arr) {
        print("${i} ")
    }


}