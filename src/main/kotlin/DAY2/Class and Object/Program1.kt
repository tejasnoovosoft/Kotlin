//class Demo constructor(){}

class Demo(name:String){
    var getName = "Name : $name".also(::println)
    fun getData(){
        println("In getData()")
    }

    init{
        println("First Execute this....")
    }
}

class Person private constructor( var name:String,var age:Int = 21){
    fun getData(){
        println(name)
        println(this.age)
    }
}

class Constructors {
    constructor(i: Int) {
        println(i)
    }

    // init block execute first
    init{
        println("Init Block")
    }
}

fun main(){
//    var obj = Demo()
//    var obj = Demo("Tejas")
//    obj.getData()
//    var obj = Person("Tejas",25)
//    obj.getData()
    var obj = Constructors(10)
    println(obj)
}