fun findSolution(str1: String, str2: String): Boolean {
    val map = HashMap<Char, Char>()
    str1.forEachIndexed { index, char ->
        if (!map.containsKey(char)) {
            map[char] = str2.elementAt(index)
        } else if (map[char] != str2.elementAt(index)) {
            println("Hii")
            return false
        }
    }
    return true
}

fun main() {
    val str1 = "ACAB"
    val str2 = "XCXY"
    val result = findSolution(str1, str2)
    if (result) {
        println("True")
    } else {
        println("False")
    }
}