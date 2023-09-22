open class A {
    open fun test(a: Int = 20) {
        println(a)
    }
}

class Child : A() {
    override fun test(a: Int) {
        super.test(a)
    }
}

fun printHello(str: String?): Unit {
    if (str != "Tejas") {
        println(str)
    } else {
        return Unit
    }
}

fun test(name: String, id: Int = 10) {
    println(name)
    println(id)
}

fun varargsDemo(vararg numbers: Int): Int {
    return 0;
}

infix fun Int.shl(x: Int): Int {
    return x;
}

fun main() {
    test("tejas", 1)
    test("Sadid")
    val obj = Child()
    obj.test(30)
    println(varargsDemo(1, 2, 3, 4, 5));
    val arr = arrayOf(1, 2, 3, 4, 5);
    val newArray = arrayOf(10, 11, 12, *arr, 13);
    println(newArray.joinToString());
    println(1.shl(2));
}