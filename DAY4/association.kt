fun main() {
    val names = listOf("Acer", "Dell", "Asus", "Lenovo", "HP")
    val assWith = names.associateWith { it.length }
    println(assWith)

    val ass = names.associate { it to it.length }
    println(ass)
}