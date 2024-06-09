package basics.Arrays


fun leftRotateArrayByOne(

    arr: Array<Int>
) {

    for (i in 1..<arr.size) {
        arr.swap(i, i - 1)
    }

}


fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5)
    leftRotateArrayByOne(arr)
    for (x in arr) {
        println(x)
    }
}