fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val evenNumbers = list.filter { it % 2 == 0 }
    list.removeAll(evenNumbers)
    println(list)
}

This solution uses a two-step approach. First, it filters the list to get a separate list of even numbers. Then, it uses `removeAll` to remove all even numbers from the original list. This ensures that all even numbers are removed correctly, avoiding the issue caused by modifying the list while iterating.