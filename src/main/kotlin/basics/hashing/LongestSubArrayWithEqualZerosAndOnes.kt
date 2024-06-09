package basics.hashing

import kotlin.math.max


private fun longestSubArrayWithSum(
    sum: Int,
    arr: Array<Int>
): Int {

    var res = 0
    val map = mutableMapOf<Int, Int>()
    var psum = 0

    for (i in arr.indices) {
        psum += arr[i]
        if (psum == sum) {
            res = i + 1
        }
        if (!map.containsKey(psum)) {
            map[psum] = i
        }
        if (map.containsKey(psum - sum)) {
            res = max(res, i - map[psum - sum]!!)
        }

    }
    return res
}


private fun longestSubArrayWithEqualZerosAndOnes(
    arr: Array<Int>
): Int {
    val modified = arr.map { if (it == 0) -1 else it }.toTypedArray<Int>()
    return longestSubArrayWithSum(
        arr = modified,
        sum = 0
    )
}

private fun main() {
    val arr = arrayOf<Int>(1, 0, 1, 1, 1, 0, 0)

    val res = longestSubArrayWithEqualZerosAndOnes(arr = arr)
    println(res)
}