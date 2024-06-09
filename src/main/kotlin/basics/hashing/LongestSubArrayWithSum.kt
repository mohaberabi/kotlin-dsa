package basics.hashing

import kotlin.math.max


private fun longestSubArrayWithSumNaive(
    sum: Int,
    arr: Array<Int>
): Int {


    var res = 0

    for (i in arr.indices) {
        var curr = 0
        for (j in i..<arr.size) {
            curr += arr[j]
            if (curr == sum) {
                res = max(res, j - i + 1)
            }
        }
    }
    return res
}


private fun longestSubArrayWithSumOptimal(
    sum: Int,
    arr: Array<Int>
): Int {
    var res = 0

    val map = mutableMapOf<Int, Int>()

    var pSum = 0

    for (i in arr.indices) {
        pSum += arr[i]
        if (pSum == sum) {
            res = i + 1
        }
        if (!map.containsKey(pSum)) {
            map[pSum] = i
        }

        if (map.containsKey(pSum - sum)) {
            res = max(i - map[pSum - sum]!!, res)
        }
    }
    return res
}

fun main() {
    val arr = arrayOf(5, 8, -4, -4, 9, -2, 2)
    val resNaive = longestSubArrayWithSumNaive(arr = arr, sum = 0)
    println(resNaive)

    val resOptimal = longestSubArrayWithSumOptimal(arr = arr, sum = 0)
    println(resOptimal)
}