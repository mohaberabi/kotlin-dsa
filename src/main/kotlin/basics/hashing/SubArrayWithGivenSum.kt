package basics.hashing


private fun hasSubArrayWithGivenSumNaive(
    arr: Array<Int>,
    sum: Int,
): Boolean {


    for (i in arr.indices) {
        var curr = 0
        for (j in i..<arr.size) {

            curr += arr[j]
            if (curr == sum) {
                return true
            }
        }
    }
    return false
}

private fun hasSubArrayWithSumOptimal(
    arr: Array<Int>,
    sum: Int,
): Boolean {
    val set = mutableSetOf<Int>()
    var prefixSum = 0

    for (x in arr) {

        prefixSum += x
        if (prefixSum == sum) {
            return true
        }
        if (set.contains(prefixSum - sum)) {
            return true
        }
        set.add(prefixSum)
    }
    return false

}