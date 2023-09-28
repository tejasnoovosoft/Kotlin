fun main() {
    val b: String? = null
//    println(b?.length)
    println(b?.length ?: 15);  // ?: elvis operator

    // let -> avoid null values
    val listWithNulls: List<String?> = listOf("Kotlin", null, "Java", "Dart")
    for (item in listWithNulls) {
        item?.let { println(it) }
    }
}