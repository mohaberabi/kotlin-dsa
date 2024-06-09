package basics.recurssion


fun toBinary(n: Int) {
    if (n == 0) {
        return
    }
    toBinary(n / 2)
    print(n)
}