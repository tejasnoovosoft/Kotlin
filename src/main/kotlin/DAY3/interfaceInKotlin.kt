interface MyInterface {
    fun abstractMethod()
    fun concreteMethod() {
        println("In Concrete Method")
    }
}

class Child3 : MyInterface {
    override fun abstractMethod() {
        println("In Overridden Method")
    }

    override fun concreteMethod() {
        println("In Overridden Concrete Method")
    }
}

interface MyInterface1 {
    val x: Int // abstract

    val propertyWithImplementation: String
        get() = "getMethod"

    fun foo() {
        print(x)
    }
}

class Child4 : MyInterface1 {
    override val x: Int = 29
}

fun main() {
//    val obj = Child3();
//    obj.concreteMethod();
//    obj.abstractMethod();

    val obj4 = Child4()
    println(obj4.propertyWithImplementation)
    println(obj4.x)
}