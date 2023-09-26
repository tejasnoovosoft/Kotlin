data class User(val name: String, val age: Int)

data class Person1(val name: String) {
    var age: Int = 21
}

fun main() {
    val usr = User("Tejas", 21)
    val usr2 = usr.copy(age = 22)
    val prs1 = Person1("Tejas")

    println(usr)
    println(usr2)
    println(prs1)

    // destructuring declarations

    val (name, age) = usr
    println("Name : $name and Age : $age")
}