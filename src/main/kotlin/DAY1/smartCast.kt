fun sum1(x: Any) {
    println("In Sum")
    if (x is Int) {
        println(x)
    } else {
        println("Not Int")
    }
}
fun whenStatement(x: Any) {
    when (x) {
        is Int -> print(x + 1)
        is String -> print(x.length + 1)
    }
}

fun main() {
    sum1(10);
    whenStatement(20);
}