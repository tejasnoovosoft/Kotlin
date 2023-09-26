enum class Cards(val color: String) {
    Diamond("black"),
    Heart("red"),
}

enum class DAYS{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

fun main(){
    val diamond = Cards.Diamond.color
    println(diamond)
    val Heart = Cards.Heart.color
    println(Heart)

    for (day in DAYS.entries){
        println(day)
    }

    println(DAYS.valueOf("WEDNESDAY"))
}