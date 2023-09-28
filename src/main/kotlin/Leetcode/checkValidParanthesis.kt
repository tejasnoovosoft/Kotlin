import java.util.*

fun isValid(s: String): Boolean {
    val stack = Stack<Char>()

    for (char in s) {
        when (char) {
            '(', '{', '[' -> stack.push(char)
            ')' -> {
                if (stack.isEmpty() || stack.pop() != '(') return false
            }

            '}' -> {
                if (stack.isEmpty() || stack.pop() != '{') return false
            }

            ']' -> {
                if (stack.isEmpty() || stack.pop() != '[') return false
            }

            else -> return false
        }
    }

    return stack.isEmpty()
}

fun main() {
    val input1 = "({})"
    val input2 = "([)]"

    println("Input 1 is valid: ${isValid(input1)}")
    println("Input 2 is valid: ${isValid(input2)}")

}
