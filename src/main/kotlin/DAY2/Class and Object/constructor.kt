class Solution1 {
    constructor() {
        println("In Solution");
    }

    constructor(name: String) {
        println("Name : $name ")
    }
}

// primary constructor
class Animal(val name: String, val color: String) {
    var animalName: String;

    // initializer block
    init {
        animalName = name;
    }

    fun getData() {
        println(name);
        println(color);
    }
}

// secondary constructor


class Fruits {

    var color: String;
    var name: String;

    // name is act as a local variable that is accessible only for constructor
    constructor(name: String, color: String, prize: Double) {
        this.color = color;
        this.name = name;
    }

    fun showData() {
        println("Fruit Color : $color")
        println("Fruit Name : $name")
    }
}

fun main() {
    var obj = Solution1();
    var obj2 = Solution1("Tejas");
    var animal1 = Animal("Cat", "Black");
    animal1.getData();

    var fruit = Fruits("Apple", "Red", 120.00);
    fruit.showData();
}

// constructor basically used to initialize the instance variables of class.
// 1.Primary Constructor : Declare as a part of class header
// 2.Secondary Constructor : Similar as JAVA