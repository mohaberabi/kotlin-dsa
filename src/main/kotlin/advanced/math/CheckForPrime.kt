package advanced.math


private fun checkForPrime(
    n: Int,
): Boolean {
    if (n == 1) {
        return false
    }

    for (i in 2..<n) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}


private fun isPrimeBetter(n: Int): Boolean {
    if (n <= 1) {
        return false
    }

    generateSequence(2) { it + 1 }
        .takeWhile { it * it <= n }
        .forEach {
            if (n % it == 0) {
                return false
            }
        }
    return true
}

private fun isPrimeOptimal(n: Int): Boolean {

    return if (n <= 1) {
        false
    } else if (n % 2 == 0 || n % 3 == 0) {
        false
    } else {
        generateSequence(5) { it + 6 }
            .takeWhile { it * it <= n }
            .forEach {
                if (n % it == 0 || n % (it + 2) == 0) {
                    return false
                }
            }
        return true
    }


}


fun main() {
    println(isPrimeOptimal(65))
}