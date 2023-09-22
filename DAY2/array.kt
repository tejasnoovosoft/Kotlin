fun main() {
    val names = arrayOf("Tejas", "Sachin", "Rahul")
    println(names.size)

    names.forEach { index ->
        if (index === "Tejas") {
            println(index)
        }
    }

    println(names.joinToString())

    val nullArr: Array<Int?> = arrayOfNulls(3)
    println(nullArr.joinToString())

    val initArray: Array<Int> = Array(5) { 0 }
    println(initArray.joinToString())

    val asc = Array(5) { i -> (i * i).toString() }
    println(asc.joinToString())

    // multidimensional array

    val twoDArray = Array(2) { Array(3) { 3 } }
    println(twoDArray.contentDeepToString())

    // iterator over two-d array
    twoDArray.forEach { index ->
        index.forEach { element ->
            print(element)
        }
        println()
    }

    val threeDArray = Array(3) { Array(3) { Array(3) { 4 } } }
    println(threeDArray.contentDeepToString())

    threeDArray.forEach { plane ->
        plane.forEach { row ->
            row.forEach { col ->
                print(col)
            }
            println()
        }
        println()
    }
}