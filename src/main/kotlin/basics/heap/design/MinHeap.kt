package basics.heap.design

import core.swap


class MinHeap(
    override val capacity: Int,
) : Heap {

    private var heap: IntArray = IntArray(capacity)

    private var _size = 0
    override val size: Int
        get() = _size

    override fun insert(data: Int) {
        if (isFull()) {
            return
        }
        _size++
        heap[size - 1] = data
        var i = _size - 1
        while (i != 0 && heap[parentIndex(i)] > heap[i]) {
            swap(i, parentIndex(i), heap)
            i = parentIndex(i)
        }
    }

    override fun traverse() {
        for (i in 0..<_size) {
            print("-${heap[i]}-")
        }
    }

    override fun top(): Int? = if (_size == 0) null else heap[0]
    override fun poll(): Int? {
        if (_size == 0) {
            return null
        }
        if (_size == 1) {
            _size = 0
            return heap[0]
        } else {
            swap(0, _size - 1, heap)
            _size--
            minHeapify(0)
            return heap[_size]
        }

    }

    private tailrec fun minHeapify(index: Int) {

        val left = leftIndex(index)
        val right = rightIndex(index)
        var smallest = index
        if (left < _size && heap[left] < heap[index]) {
            smallest = left
        }
        if (right < _size && heap[right] < heap[smallest]) {
            smallest = right
        }
        if (smallest != index) {
            swap(index, smallest, heap)
            minHeapify(smallest)
        }
    }

    override fun delete(index: Int): Int? {
        if (isEmpty()) {
            return null
        }
        if (_size == 1) {
            _size = 0
            return heap[0]
        } else {
            // makes the top element is -oo
            //
            update(index, Int.MIN_VALUE)
            return poll()
        }

    }

    override fun isEmpty(): Boolean = _size == 0
    override fun update(index: Int, value: Int) {
        if (isEmpty()) {
            _size++
            heap[size - 1] = value
        } else {
            heap[index] = value
            var i = index
            while (i != 0 && heap[i] < heap[parentIndex(i)]) {
                swap(i, parentIndex(i), heap)
                i = parentIndex(i)
            }

        }
    }

    override fun build(arr: IntArray) {
        heap = IntArray(arr.size)
        for (x in arr) {
            insert(x)
        }
    }

    private fun isFull() = _size == capacity
}

fun main() {
    val heap = MinHeap(10)
    with(heap) {
        insert(10)
        insert(20)
        insert(15)
        insert(40)
        insert(50)
        insert(100)
        insert(25)
        insert(45)
        insert(12)
        traverse()
        println()
        println(size)
        println(heap.poll())
        println(size)
        println(top())
    }
}

