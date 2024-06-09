package basics.hashing.linear_probbing


private const val deleted = -2
private const val empty = -1

private class LinearProbbing(
    private val capacity: Int = 7
) {

    private var size: Int = 0
    private fun hash(key: Int): Int = key % capacity
    private val table = IntArray(capacity) { empty }


    fun remove(key: Int) {
        table[key] = deleted
        size--
    }

    fun search(key: Int): Boolean {
        val index = hash(key)
        var i = index
        while (table[i] != empty) {
            if (table[i] == key) {
                return true
            }
            i = hash(i + 1)
            if (i == index) {
                return false
            }
        }
        return false
    }

    fun insert(key: Int): Boolean {
        if (size == capacity) {
            return false
        }
        val index = hash(key)
        var i = index
        while (table[i] != empty && table[i] != deleted) {
            i = hash(i + 1)
        }
        return if (table[i] == key) {
            false
        } else {
            table[i] = key
            size++
            true
        }

    }


}