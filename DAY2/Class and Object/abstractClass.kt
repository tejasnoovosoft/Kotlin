abstract class Polygon {
    abstract fun perimeter()
    open fun area() {
        println("Area of Polygon is 20sqm")
    }
}

class Shape : Polygon() {
    override fun perimeter() {
        println("Perimeter of Polygon")
    }

    override fun area() {
        println("Area of Polygon is 50sqm")
        super.area();
    }

    fun volume(){

    }
}

fun main() {
    var obj = Shape();
    obj.perimeter();
    obj.area();
}