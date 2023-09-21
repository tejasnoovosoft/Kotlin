fun compareNumbers(a: Int, b: Int): Int {
    if (a > b) {
        return a
    }
    return b
}

fun isEqual(a:Int,b:Int): Boolean {
    if(a == b){
        return true
    }
    return false
}
fun switchCase(){
    val num = (0..10).random()
    when(num){
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        else -> {
            println("No Matched")
        }
    }
}

fun whenStatement(){
    val fruits = listOf("Apple","Graphs","Banana","Mango")
    when {
        "Orange" in fruits -> println("Juicy")
        "Apple" in fruits -> println("Fine too")
    }
}
fun main() {
    println(compareNumbers(10,20))
    switchCase()
    println(isEqual(20,30))
    whenStatement()
}