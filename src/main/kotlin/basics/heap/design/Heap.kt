package basics.heap.design

import kotlin.math.abs

interface Heap {
    val size: Int
    val capacity: Int
    fun insert(data: Int)
    fun traverse()
    fun poll(): Int?
    fun top(): Int?
    fun update(index: Int, value: Int)
    fun isEmpty(): Boolean
    fun delete(index: Int): Int?
    fun build(arr: IntArray)
}

fun Heap.leftIndex(node: Int): Int = 2 * node + 1
fun Heap.rightIndex(node: Int): Int = 2 * node + 2
fun Heap.parentIndex(node: Int): Int = abs((node - 1) / 2)