package basics.Arrays


fun secondLargestElementInArrayOptimal(
    arr: Array<Int>
): Int {

    var res = -1
    var largest = 0
    for (i in 1..<arr.size) {
        if (arr[i] > arr[largest]) {
            res = largest
            largest = i
        } else if (arr[i] != arr[largest]) {

            if (res == -1 || arr[i] > arr[res]) {
                res = i
            }
        }
    }
    return res
}

fun secondLargestElementInArrayNaive(
    arr: Array<Int>
): Int {

    var res = -1


    val largest = getLargest(arr)

    for (i in arr.indices) {
        if (arr[i] != arr[largest]) {
            if (res == -1) {
                res = i
            } else if (arr[i] > arr[res]) {
                res = i
            }
        }
    }

    return res

}

fun getLargest(
    arr: Array<Int>
): Int {


    var res = -1
    for (i in 1..<arr.size) {
        if (arr[i] > arr[i - 1]) {
            res = i
        }
    }
    return res

}