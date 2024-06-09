package basics.sorting.mergesort.merge


fun printTwoSortedArraysAsMerged(
    arr1: Array<Int>,
    arr2: Array<Int>
) {


    var i = 0
    var j = 0
    val n = arr1.size
    val m = arr2.size

    while (i < n && j < m) {

        if (arr1[i] <= arr2[j]) {
            print("${arr1[i++]} ")
        } else {
            print("${arr2[j++]} ")

        }
    }


    while (i < n) {
        print("${arr1[i++]} ")
    }
    while (j < m) {
        print("${arr2[j++]} ")
    }


}


fun main() {

    val arr1 = arrayOf(0, 2, 4, 6, 8, 10, 11, 12, 13, 14)
    val arr2 = arrayOf(1, 3, 5, 7, 9)

    printTwoSortedArraysAsMerged(arr1, arr2)

}