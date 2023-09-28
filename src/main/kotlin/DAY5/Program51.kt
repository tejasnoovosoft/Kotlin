fun main() {
    val name: String? = "Tejas"
    println(name)

    val length = name!!.length
    println(length)

//    var a : String? = "Noovosoft"
//    println(a)
//    a = null
//    println(a)

    var a: String? = "Noovosoft"
    println(a)
    a = null
    println(a)

    val b: String? = null
    val l = b?.length
    println(l)
}

// ? -> Can Hold Null values
// !! -> Not null assertion operator. It assurs that it cannot hold null values