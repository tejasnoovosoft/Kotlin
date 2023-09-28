class Node1(var a : Int?){
    val y:Int? = a as? Int
}

fun main(){
    val obj = Node1(20)
}