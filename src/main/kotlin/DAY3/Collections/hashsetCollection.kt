fun main() {
    val dataA = hashSetOf(1, 2, 3, 4, 5)
    println(dataA)

    val dataB = hashSetOf("Geeks", "for", "Geeks", "Noovosoft", "TechOrbit")
    println(dataB)

    // manipulate hashset

    dataB.add("Nvidia")
    println(dataB)

    val setC = hashSetOf<Int>()
//    setC.add(20)
    println(setC.isEmpty())

    println(dataA == dataB)

    dataA.remove(3)
    println(dataA)

    val linkedHashSet = LinkedHashSet<String>()
    linkedHashSet.addAll(linkedSetOf("Geeks", "for", "Geeks", "Noovosoft", "TechOrbit"))
    println(linkedHashSet)
    linkedHashSet.add("Nvidia")
    println(linkedHashSet)
}