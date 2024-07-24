package advanced.math

import kotlin.math.min


private fun gcd(a: Int, b: Int): Int {
    var min = min(a, b)
    while (min > 0) {
        if (a % min == 0 && b % min == 0) {
            break
        }
        min--
    }
    return min
}


private fun euclideanGCD(
    a: Int, b: Int,
): Int {

    var aTemp = a
    var bTemp = b
    while (aTemp != bTemp) {
        if (aTemp > bTemp) {
            aTemp -= bTemp
        } else {
            bTemp -= aTemp
        }
    }
    return aTemp
}

private fun euclideanGCDOptimal(
    a: Int, b: Int,
): Int {


    return if (b == 0) {
        a

    } else {
        euclideanGCDOptimal(b, a % b)
    }

}

