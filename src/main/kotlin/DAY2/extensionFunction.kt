fun main(){
    println("Hello Tejas Ekhande".formattedString())
}

fun String.formattedString() : String{
    return "------------\n$this\n---------------"
}