fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list)
}

This code snippet intends to remove even numbers from a list using `removeIf`. However, modifying a list while iterating over it with `removeIf` can lead to unexpected behavior and missing elements.  The iterator might skip elements after removal. 