package basics.searching


private fun recursiveBinarySearch(
    arr: Array<Int>,
    low: Int = 0,
    high: Int = arr.lastIndex,
    x: Int
): Int {
    if (low > high) {
        return -1
    }
    val mid = (low + high) / 2
    return if (arr[mid] == x) {
        mid
    } else if (arr[mid] > x) {
        recursiveBinarySearch(arr, low, mid - 1, x)
    } else {
        recursiveBinarySearch(arr, mid + 1, high, x)
    }
}

fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5, 21, 31, 23, 213)
    val index = recursiveBinarySearch(arr, x = 5)
    println(index)
}