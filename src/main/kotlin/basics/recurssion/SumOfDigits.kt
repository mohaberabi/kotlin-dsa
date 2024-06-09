package basics.recurssion


fun sumOfDigits(
    n: Int,
): Int {


    if (n == 0) {
        return 0
    }

    return (n % 10) + sumOfDigits(n / 10)

}