package advanced.math


private fun primeFactors(n: Int) {


    for (i in 2..<n) {
        if (isPrime(i)) {
            var x = i
            while (n % x == 0) {
                println(i)
                x *= i
            }
        }
    }
}


private fun isPrime(n: Int): Boolean {

    if (n <= 1) {
        return false
    }
    if (n % 2 == 0 || n % 3 == 0) {
        return false
    }
    generateSequence(2) { it + 6 }
        .takeWhile { it * it <= n }
        .forEach {
            if (n % it == 0 || n % (it + 1) == 0) {
                return false
            }
        }
    return true
}


private fun primeFactorsMoreOptimal(n: Int) {

    if (n <= 1) {
        return
    }
    var temp = n
    while (temp % 2 == 0) {
        println(2)
        temp /= 2
    }
    while (temp % 3 == 0) {
        println(3)
        temp /= 3
    }
    generateSequence(5) { it + 6 }
        .takeWhile {
            it * it <= temp
        }.forEach { i ->
            while (temp % i == 0) {
                println(i)
                temp /= i
            }
            while (temp % (i + 2) == 0) {
                println(i + 2)
                temp /= (i + 2)
            }
        }
    if (temp > 3) {
        println(temp)
    }
}

private fun primeFactorsOptimal(n: Int) {
    if (n <= 1) {
        return
    }

    var temp = n
    for (i in 2..<temp) {

        while (temp % i == 0) {
            println(i)
            temp /= i
        }
    }
    if (temp > 1) {
        println(temp)
    }
}

fun main() {
    primeFactorsMoreOptimal(450)
}