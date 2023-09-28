fun main() {
    val numbers = listOf(1, 2, 3, 2, 4, 1, 5, 5, 6)

    val distinctNumbers = numbers.distinct()
    println("List after removing duplicates using distinct(): $distinctNumbers")

    // Method 2: Using toSet() to remove duplicates
    val uniqueNumbers = numbers.toSet().toList()
    println("List after removing duplicates using toSet(): $uniqueNumbers")
}