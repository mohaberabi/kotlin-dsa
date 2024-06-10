package basics.sorting

import kotlin.math.max


private fun meetMaximumGuests(

    arrivals: Array<Int>,
    deparatures: Array<Int>
): Int {

    arrivals.sort()
    deparatures.sort()

    var i = 1
    var j = 0
    var res = 1
    var curr = 1
    val n = arrivals.size
    while (i < n && j < n) {
        if (arrivals[i] <= deparatures[j]) {
            curr++
            i++
        } else {
            curr--
            j++
        }
        res = max(res, curr)
    }
    return res
}