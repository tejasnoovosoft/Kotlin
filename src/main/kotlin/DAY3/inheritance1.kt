open class GreatApe {
    protected var energy = 0
    open fun call() = "Hoo!"
    open fun eat() {
        energy += 10
    }

    fun climb(x: Int) {
        energy -= x
    }

    fun energyLevel() = "Energy: $energy"
}

class Banobo : GreatApe() {
    override fun call() = "Eep"
    override fun eat() {
        energy += 20;
        println("Energy : $energy")
        super.eat();
    }
}

fun main() {
    val obj = Banobo();
    obj.eat();
}