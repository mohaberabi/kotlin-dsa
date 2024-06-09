package basics.hashing.impl


class MyChainedMap<K, V> {


    companion object {
        private const val BUCKET = 16
        private const val LOAD_FACTOR_THRESHOLD = 0.75f
    }

    private var table = MutableList(BUCKET) { ChainedLinkedList<K, V>() }

    private var size = 0
    private fun hash(k: K): Int = k.hashCode() % BUCKET

    fun insert(p: Pair<K, V>) {
        if (shouldResize()) {
            resize()
        }
        val index = hash(p.first)
        table[index].add(p.first, p.second)
        size++
    }


    fun insert(key: K, value: V) {
        if (shouldResize()) {
            resize()
        }
        val index = hash(key)
        table[index].add(key, value)
        size++
    }

    fun contains(key: K): Boolean {
        val index = hash(key)
        return table[index].contains(key)
    }

    fun remove(key: K) {
        val index = hash(key)
        table[index].remove(key)
        size--
    }

    fun get(key: K): V? {
        val index = hash(key)
        return table[index].get(key)
    }

    private fun shouldResize(): Boolean = ((size + 1).toFloat() / table.size > LOAD_FACTOR_THRESHOLD)

    private fun resize() {
        val newCap = table.size * 2
        val newTable = MutableList(newCap) { ChainedLinkedList<K, V>() }
        table.forEach { bucekt ->
            bucekt.forEach { k, v ->
                val index = hash(k)
                newTable[index].add(k, v)
            }
        }
        table = newTable
    }
}

fun main() {
    val map = MyChainedMap<String, Int>().apply {
        insert("mohab" to 26)
        insert("basil" to 100)

    }

    map.apply {
        println(contains("mohab"))
        println(contains("basil"))

    }
    map.apply {
        println(get("mohab"))
        println(get("basil"))

    }
}

