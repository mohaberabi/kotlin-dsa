package basics.hashing


private fun countDistnictElements1(
    arr: Array<Int>
): Int = arr.toSet().size


private fun countDistnictElements2(
    arr: Array<Int>
): Int {


    val set = mutableSetOf<Int>()
    for (x in arr) {
        set.add(x)
    }
    return set.size
}

private fun main() {


    val arr = arrayOf<Int>(
        10000,
        10000,
        10000,
        10000,
        10000,
        10000,
        10000,
    )

    val distncit1 = countDistnictElements1(arr)
    val distnict2 = countDistnictElements2(arr)
    println(distncit1)
    println(distnict2)
}
