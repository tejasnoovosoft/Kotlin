open class Demo {
    val x: Int = 10;
}

class child: Demo(){
    fun accessMember(){
        println(super.x);
    }
}
class Solution(var height: Double, var width: Double){
    val perimeter: Double = (height + width) * 2;
}

fun main() {
    var obj = Solution(10.5, 20.5);
    var obj2 = child();
    obj2.accessMember();
    println(obj.perimeter);
}