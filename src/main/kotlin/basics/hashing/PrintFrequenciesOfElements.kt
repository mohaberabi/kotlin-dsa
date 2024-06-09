package basics.hashing


fun printFrequenciesOfElements(
    arr: Array<Int>
) {

    val map = mutableMapOf<Int, Int>()

    for (x in arr) {
        map[x] = map[x]?.let {
            it + 1
        } ?: 1
    }
    map.forEach { (k, v) ->
        println("${k}: ${v}")
    }
}

fun main() {
    val arr = arrayOf(10, 12, 10, 15, 10, 20, 12, 12)
    printFrequenciesOfElements(arr)
}