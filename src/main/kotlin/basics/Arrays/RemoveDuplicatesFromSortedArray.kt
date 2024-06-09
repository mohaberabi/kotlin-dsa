package basics.Arrays


fun removeDuplicatedFromSortedArrayOptimal(
    arr: Array<Int>
) {
    var res = 1
    for (i in 1..<arr.size) {
        if (arr[i] != arr[i - 1]) {
            arr[res] = arr[i]
            res++
        }
    }
}


fun removeDuplicatedFromSortedArrayNaive(
    arr: Array<Int>
) {
    val temp = arrayOf<Int>()
    temp[0] = arr[0]
    var res = 1
    for (i in 1..arr.size) {
        if (temp[res - 1] != arr[i]) {
            temp[i] = arr[i]
            res++
        }
    }

    for (i in temp.indices) {
        arr[i] = temp[i]
    }
}