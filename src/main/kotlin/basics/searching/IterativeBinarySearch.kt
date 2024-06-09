package basics.searching


private fun binarySearch(
    arr: Array<Int>,
    x: Int
): Int {
    var left = 0
    var right = arr.lastIndex
    while (left <= right) {
        val mid = (left + right) / 2
        if (arr[mid] == x) {
            return mid
        } else if (arr[mid] > x) {
            right = mid - 1
        } else {
            left = mid + 1
        }
    }
    return -1
}


fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5, 21, 31, 23, 213)
    val index = binarySearch(arr, 31)
    println(index)
}