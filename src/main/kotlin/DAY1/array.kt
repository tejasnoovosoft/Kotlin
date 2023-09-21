fun main() {
    val num = arrayOf(1, 2, 3, 4, 5, 6)
    num.forEach( { index ->
        if (index == 5) {
            println("Five")
        }
    })

    val items = listOf("Apple", "Banana", "Orange", "Mango")
    for (item in items) {
        println(item)
    }
    for (item in items.indices) {
        println(items[item])
    }
}