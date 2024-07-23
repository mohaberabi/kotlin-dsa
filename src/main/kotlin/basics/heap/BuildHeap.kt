package basics.heap

import basics.heap.design.Heap
import core.swap
import kotlin.math.abs
import kotlin.math.min


private fun buildHeap(
    arr: IntArray,
) {
    val size = arr.size
    var i = (size - 2) / 2
    while (i >= 0) {
        minHeapfiy(i, arr)
        i--
    }
}


private fun minHeapfiy(
    index: Int,
    arr: IntArray,
) {

    var size = arr.size
    var smallest = index
    val left = leftIndex(smallest)
    val right = rightIndex(smallest)
    if (left < size && arr[left] < arr[index]) {
        smallest = left
    }
    if (right < size && arr[right] < arr[smallest]) {
        smallest = right
    }
    if (smallest != index) {
        swap(smallest, index, arr)
        minHeapfiy(smallest, arr)
    }
}


private fun leftIndex(node: Int): Int = 2 * node + 1
private fun rightIndex(node: Int): Int = 2 * node + 2

fun main() {
    val arr = intArrayOf(10, 5, 20, 2, 4, 8)
    for (x in arr) {
        print("${x} ")
    }
    println()
    buildHeap(arr)
    for (x in arr) {
        print("${x} ")
    }
}