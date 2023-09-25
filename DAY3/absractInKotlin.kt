abstract class Base1 {
    abstract fun marry();
    fun property() {
        println("Bunglow,Cars,Farm")
    }
}

class Derived1 : Base1() {
    override fun marry() {
        println("Disha Patani")
    }
}

fun main() {
    val obj = Derived1()
    obj.marry()
    obj.property()
}