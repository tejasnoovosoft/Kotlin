// generics in kotlin

class MyName<T>(text: T) {
    var name = text
}

fun <T : Comparable<T>> sort(list: List<T>) {
    println(list.sorted())
}

fun copy(from: Array<out Any>, to: Array<Any>) {
    
}

fun main() {
    val obj1: MyName<String> = MyName("Tejas")
    println(obj1.name)

    val obj2: MyName<Int> = MyName(20)
    println(obj2.name)

    val obj3 = MyName(true)
    println(obj3.name)

    sort(listOf(1, 2, 4, 3)) // OK. Int is a subtype of Comparable<Int>

    val intArray = arrayOf(1, 2, 3, 4);
    val anyArray = Array<Any>(3) { "" }
    copy(intArray, anyArray)

}