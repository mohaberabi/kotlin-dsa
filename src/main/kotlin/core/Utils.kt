package core


fun swap(i: Int, j: Int, arr: Array<Int>) {
    val temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}