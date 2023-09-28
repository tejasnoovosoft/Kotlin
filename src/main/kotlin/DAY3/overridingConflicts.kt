interface P {
    fun foo() {
        println("A")
    }

    fun bar()
}

interface Q {
    fun foo() {
        println("B")
    }

    fun bar() {
        println("Bar")
    }
}

class X : P {
    override fun bar() {
        println("Bar in Class X")
    }
}

class Y : P, Q {
    override fun foo() {
//        super.foo();
        super<P>.foo()
        super<Q>.foo()
    }

    override fun bar() {
        super<Q>.bar()
    }
}

fun main() {
    val obj = Y()
    obj.foo()
}