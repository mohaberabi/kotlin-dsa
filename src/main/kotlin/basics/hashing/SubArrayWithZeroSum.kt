package basics.hashing


fun hasSubArrayWithZeroSumNaive(
    arr: Array<Int>
): Boolean {


    for (i in arr.indices) {
        var sum = 0
        for (j in i..<arr.size) {
            sum += arr[j]
            if (sum == 0) {
                return true
            }
        }
    }
    return false


}

fun hasSubArrayWithZeroSumOptimal(
    arr: Array<Int>
): Boolean {
    val set = mutableSetOf<Int>()
    var sum = 0
    for (x in arr) {
        sum += x
        if (set.contains(sum)) {
            return true
        }
        if (sum == 0) {
            return true
        }
        set.add(sum)
    }

    return false


}