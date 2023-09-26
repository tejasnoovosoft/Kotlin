class InnerDemo {
    private var x: Int = 1

    class Nested {
        fun foo() = 2
    }
}

open class SuperClass {
    open fun someFunction() {
        println("In SuperClass")
    }
}

fun main() {
    val obj = InnerDemo.Nested().foo()
    println(obj)

    val obj2 = object : SuperClass() {
        override fun someFunction() {
            println("In Anonymous Inner Class")
        }
    }
    obj2.someFunction()
}