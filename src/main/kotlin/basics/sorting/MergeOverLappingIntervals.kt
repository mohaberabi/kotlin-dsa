package basics.sorting

import java.util.Collections
import kotlin.math.max
import kotlin.math.min


private fun mergeOverLappingIntervals(
    intervals: MutableList<Pair<Int, Int>>
): List<Pair<Int, Int>> {
    intervals.sortWith(compareBy { it.first })
    val merged = mutableListOf<Pair<Int, Int>>()
    var res = 0
    for (i in 1..<intervals.size) {
        val prev = intervals[res]
        val curr = intervals[i]
        if (prev.second >= curr.first) {
            intervals[res] = min(prev.first, curr.first) to max(prev.second, curr.second)
        } else {
            res++
            intervals[res] = intervals[i]
        }

    }
    for (i in 0..res) {
        merged.add(intervals[i])
    }
    return merged
}


fun main() {

    val intervals = mutableListOf<Pair<Int, Int>>(5 to 10, 3 to 15, 18 to 30, 2 to 7)
    val res = mergeOverLappingIntervals(intervals)
    for (p in res) {
        println("${p.first} -> ${p.second}")
    }
}