// functions in kotlin
fun sumOfNumbers(a: Int, b: Int): Int {
    println("Value of a is \$a and b is $b")
    return a + b;
}

fun sumOfTwoNumbers(a: Int, b: Int) = a + b;

fun run(a: Int): Unit {
    println("Value of a is $a")
}

fun gun(a: Int) {
    println("Value of a is $a")
}

fun main() {
    println(sumOfNumbers(10, 20))
    println(sumOfTwoNumbers(10, 20))
    run(20);
    gun(20);
}