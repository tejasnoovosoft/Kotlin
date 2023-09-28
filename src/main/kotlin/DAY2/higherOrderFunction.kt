import kotlin.math.pow

fun main() {
    println(sum(2.0, 3.0))
    println(power(2.0, 3.0))

    val fn: (a: Double, b: Double) -> Double = ::sum
    println(fn(2.0, 4.0));
    calculator(4.0, 3.0, ::sum);
}

fun sum(a: Double, b: Double): Double {
    return a + b
}

fun power(a: Double, b: Double): Double {
    return a.pow(b)
}

fun calculator(a: Double, b: Double, gn: (Double, Double) -> Double) {
    val result = gn(a, b)
    println(result)
}

// function can be passed to the function or return a function from a function is called higher order function
// why we used higherOrderFunction ? -->