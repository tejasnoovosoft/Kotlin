fun main() {
    // val fn: (a: Int, b: Int) -> Int = ::sum

    println(calculator(40, 20) { a, b -> a + b })

    // we can write lambda expression outside the function parameter
    // val lambda1 = { a: Int, b: Int -> a + b }

    val multiLineLambda = {
        println("Hello Lambda")
        val a = 2 + 3
        println(a)
        2
    }

    println(multiLineLambda())
    //Return type decide based on the last line of lambda function
    // val singleParameterLambda = { x: Int -> x * x }
    // val lambda2: (Int) -> Int = { x -> x * x };

    sum(1,2);
}

//fun sum(a: Int, b: Int): Int = a + b

fun sum(a:Int,b:Int){
    println(a.plus(b));
}

fun calculator(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}

// we can replace single parameter by 'it'