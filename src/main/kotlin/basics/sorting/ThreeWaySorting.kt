package basics.sorting

import shared.swap


fun sortArrayOfTwosOnesZeroesNaive(
    arr: Array<Int>
) {

    val temp = IntArray(arr.size)

    var index = 0
    for (i in arr.indices) {
        if (arr[i] == 0) {
            temp[index++] = 0
        }
    }

    for (i in arr.indices) {
        if (arr[i] == 1) {
            temp[index++] = 1
        }
    }
    for (i in arr.indices) {
        if (arr[i] == 2) {
            temp[index++] = 2
        }
    }
    for (i in arr.indices) {


        arr[i] = temp[i]
    }
}

fun dutchNationalFlag(
    arr: Array<Int>,
) {


    var mid = 0
    var low = 0
    var high = arr.size - 1
    while (mid <= high) {
        if (arr[mid] == 0) {
            swap(mid, low, arr)
            low++
            mid++
        } else if (arr[mid] == 1) {
            mid++
        } else {
            swap(mid, high, arr)
            high--
        }
    }

}