open class Parent{
    open var id:Int = 1;
    open fun info(){
        println("Id : $id")
    }
}

class Child1 : Parent(){
    override var id:Int = 10;
    override fun info(){
        println("Id : $id");
    }
}

fun main(){
    var obj = Child1();
    obj.info();
}