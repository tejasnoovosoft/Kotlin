fun main() {
    var gender: String? = "Male"
    println(gender)
//    gender = null
    println(gender)

    if (gender != null) {
        println(gender.toUpperCase())
    }

    println(gender?.toUpperCase())          // call when gender is not null

    gender?.let{
        println(gender.toUpperCase())          // call when gender is not null
        println("Line 1")
    }

    var selectedValue = gender ?: "NA"
    println(selectedValue)

//    var name :String? = null
//    println("Name Length ${name?.length ?: -1}")   // elvis operator
//    val l = name!!.length
//    println(l)

    val nullableList : List<Int?> = listOf(1,2,3,null,4)
    val intList: List<Int> = nullableList.filterNotNull()
    println(nullableList)
    println(intList)
}

// safe call (?.) : execute the call only when the value is non-null