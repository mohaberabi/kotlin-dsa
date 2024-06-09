package basics.hashing.chaining


private const val BUCKET = 7

private class Chaining(
    private val bucket: Int = BUCKET,
) {

    private val table = mutableListOf<LinkedList>().apply {
        repeat(bucket) {
            add(LinkedList())
        }
    }

    private fun hash(key: Int): Int = key % bucket

    fun insert(key: Int) {
        val index = hash(key)
        table[index].insert(key)
    }

    fun search(key: Int): Boolean {
        val index = hash(key)
        return table[index].contains(key)
    }

    fun remove(key: Int) {
        val index = hash(key)
        table[index].remove(key)
    }
}


fun main() {
    val chain = Chaining()
    chain.apply {
        insert(100)
        insert(200)
        insert(300)
        insert(400)
        insert(500)
        insert(600)
    }
    chain.apply {
        println(search(100))
        println(search(200))
        println(search(300))
        println(search(400))
        println(search(500))
        println(search(600))
    }

    chain.apply {
        remove(100)
        remove(200)
        remove(300)
        remove(400)
        remove(500)
        remove(600)
    }
    chain.apply {
        println(search(100))
        println(search(200))
        println(search(300))
        println(search(400))
        println(search(500))
        println(search(600))
    }

}