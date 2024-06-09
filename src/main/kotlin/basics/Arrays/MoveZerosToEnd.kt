package basics.Arrays


fun moveZerosToEnd(
    arr: Array<Int>
) {

    for (i in arr.indices) {
        if (arr[i] == 0) {
            for (j in i + 1..<arr.size) {
                arr.swap(i, j)
            }
        }
    }
}


fun moveZerosToEndOptimal(

    arr: Array<Int>
) {
    var count = 0
    for (i in arr.indices) {
        if (arr[i] != 0) {
            arr.swap(i, count)
            count++
        }
    }
}