//open class Parent1 {
//    open var id = 20
//    open fun parentMethod() {
//        println("In Parent Method")
//    }
//
//}
//
//class Child2 : Parent1() {
//    override var id: Int = 50;
//
//    fun getData() {
//        println(id)
//        parentMethod();
//    }
//}

open class Polygon1 {
    open fun draw() {
        println("In Draw Function")
    }
}

abstract class Shape1 : Polygon1() {
    abstract override fun draw()
}

fun main() {
//    val obj = Child2()
//    obj.getData()
//    println(Parent1().id);
}