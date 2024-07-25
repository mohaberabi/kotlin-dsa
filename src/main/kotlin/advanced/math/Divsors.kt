package advanced.math


private fun allDivisorsOfNumber(n: Int) {
    for (i in 1..n) {
        if (n % i == 0) {
            println(i)
        }
    }
}


private fun allDivisorsSorted(n: Int) {
    var i = 1
    while (i * i < n) {
        if (n % i == 0) {
            println(i)
        }
        i++
    }
    while (i >= 1) {
        if (n % i == 0) {
            println(n / i)
        }
        i--
    }
}

private fun allDivisorsNotSorted(n: Int) {
    generateSequence(1) { it + 1 }
        .takeWhile { it * it <= n }
        .forEach {
            if (n % it == 0) {
                println(it)
                if (it != n / it) {
                    println(n / it)
                }
            }
        }
}