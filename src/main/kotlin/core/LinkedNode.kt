package core

data class LinkedNode(
    var data: Int,
    var next: LinkedNode? = null,
    var prev: LinkedNode? = null,
)