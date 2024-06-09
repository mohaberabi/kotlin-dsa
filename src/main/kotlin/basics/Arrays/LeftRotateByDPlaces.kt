package basics.Arrays


fun leftRotateArrayByDPlacesMethod2(
    d: Int,
    arr: Array<Int>
) {

    val n = arr.size
    val temp = arr.clone()

    for (i in d..<n) {
        arr[i - d] = arr[i]
    }

    for (i in 0..<d) {
        arr[n - d + i] = temp[i]
    }

}

fun leftRotateByDPlacesMethod1(
    arr: Array<Int>,
    d: Int
) {
    for (i in 0..<d) {
        leftRotateArrayByOne(arr)
    }

}

fun leftRotateArrayByDOptimal(
    d: Int,
    arr: Array<Int>
) {
    val n = arr.size
    arr.reverse(0, d - 1)
    arr.reverse(d, n - 1)
    arr.reverse(0, n - 1)
}

fun main() {

    val arr = arrayOf(1, 2, 3, 4, 5)
    leftRotateArrayByDPlacesMethod2(2, arr)
    for (x in arr) {
        println(x)
    }
}