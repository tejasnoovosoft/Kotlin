fun main(){
    val names = listOf("Tejas","Ekhande")
    val char = names.flatMap { it.toList() }
    println(char)
}