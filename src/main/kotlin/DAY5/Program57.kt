fun evaluateData(a: Int, b: Int, operation: (x: Int, y: Int) -> Int): Int {
    return operation(a, b)
}

fun multiplier(factor: Int): (Int) -> Int {
    return { x -> x * factor }
}


fun main() {
    val sum = evaluateData(10, 20) { a, b -> a + b }
    println(sum)
    val mul = evaluateData(10,20){a,b -> a*b}
    println(mul)

    val double = multiplier(2)
    val triple = multiplier(3)
    val result1 = double(5) // Result: 10
    println(result1)
    val result2 = triple(5) // Result: 15
    println(result2)
}

