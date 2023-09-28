fun romanToInt(s: String): Int {
    val romanMap = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var result = 0
    var prevValue = 0

    for (i in s.length - 1 downTo 0) {
        val currentValue = romanMap[s[i]] ?: 0

        if (currentValue < prevValue) {
            result -= currentValue
        } else {
            result += currentValue
        }
        prevValue = currentValue
    }

    return result
}

fun main() {
    val roman1 = "III"
    val roman2 = "IX"

    println("Roman numeral $roman1 is equal to ${romanToInt(roman1)}")
    println("Roman numeral $roman2 is equal to ${romanToInt(roman2)}")
}
