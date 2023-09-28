fun main() {
    val mapDemo = mapOf(1 to "Tejas", 2 to "Vaishnav", 3 to "Sadid", 4 to "Pulkit")
    println(mapDemo)

    val map = hashMapOf(1 to "DBMS", 2 to "OS", 3 to "WEB", 4 to "IOT")
//    map.put(5,"DSA")
    map[5] = "DSA"
    println(map)
    println(map.keys)
    println(map.values)

    val it = map.iterator()
    while (it.hasNext()) {
        val data = it.next()
        print("Key : ${data.key} ")
        println("Value : ${data.value}")
    }

    println("Count : ${map.count()}")

    println(map.getOrElse(4) { 9 })
}