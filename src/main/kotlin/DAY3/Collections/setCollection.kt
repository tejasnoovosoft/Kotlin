fun main() {
    val captains = setOf("Kohli", "Smith", "Root", "Malinga", "Rohit", "Dhawan");
    println(captains);
    println(captains.elementAt(3))
    println(captains.first())
    println(captains.last())

    val number = setOf(18, 12, 34, 4, 77, 45, 43);
    println(number.max())
    println(number.count())
    println(number.average())
    println(number.sum())
    println(number.contains(18))
    println(number.contains(19))
}