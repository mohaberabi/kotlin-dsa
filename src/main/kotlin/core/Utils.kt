package core


fun swap(i: Int, j: Int, arr: Array<Int>) {
    val temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}

fun swap(
    i: Int, j: Int, arr: IntArray,
) {
    val temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}