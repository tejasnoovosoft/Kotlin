import java.util.*

fun findSolution(list1: List<Int>, list2: List<Int>): List<Int> {
    val resultList = MutableList(list1.size) { 0 }
    for (i in list1.indices) {
        for (j in 0..i) {
            if (list2[j] <= list1[i]) {
                resultList[i] += 1
            }
        }
    }
    return resultList
}


fun main() {
    val sc = Scanner(System.`in`)

    println("Enter Size of List : ")
    val n = readlnOrNull()?.toIntOrNull() ?: 0

    val list1 = mutableListOf<Int>()
    println("Enter Elements in List1 : ")

    for (i in 1..n) {
        readlnOrNull()?.toIntOrNull()?.let { element ->
            list1.add(element)
        }
    }

    val list2 = mutableListOf<Int>()
    println("Enter Elements in List1 : ")
    for (i in 1..n) {
        readlnOrNull()?.toIntOrNull()?.let { element ->
            list2.add(element)
        }
    }

    val result = findSolution(list1, list2)
    println(result)
}
