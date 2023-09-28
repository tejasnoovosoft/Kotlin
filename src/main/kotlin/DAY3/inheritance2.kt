//open class Base(val i:Int)
//
//class Derived : Base{
//    constructor(i: Int) : super(i)
//    constructor() : this(9)
//}

open class Base() {
    init {
        println("In Base Constructor")
    }
}

class Derived// first line super() which calls to parents constuctor
    () : Base() {
    init {
        println("In Derived Constructor")
    }
}

fun main() {
    val d1 = Derived();
}