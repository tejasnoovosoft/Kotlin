fun interface FunctionalInterface {
    fun concreteMethod() {
        println("Concrete Methods")
    }

    fun accept(i: Int): Boolean
}

fun interface PredictEvenNumber {
    fun accept(i: Int): Boolean
}


fun interface CalculateSum {
    fun sum(a: Int, b: Int): Int
}

var isEven = PredictEvenNumber { it % 2 == 0 }
var twoSum = CalculateSum { a, b ->
    if (a % 2 == 0) {
        return@CalculateSum a + b
    } else {
        return@CalculateSum a - b
    }
}

fun main() {
//    val isEven = object : FunctionalInterface{
//        override fun accept(i: Int): Boolean {
//            return i % 2 == 0;
//        }
//    }
    println(isEven.accept(20))
    println(twoSum.sum(31, 20))
}