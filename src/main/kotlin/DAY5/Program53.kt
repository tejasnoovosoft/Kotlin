import java.lang.IllegalArgumentException

class Node{
    fun getName() : Any? {
        return null;
    }
}

fun getUserData(node : Node){
    val name = node.getName().also{ println(it)} ?: throw IllegalArgumentException("Name Expected")
}

fun main(){
    val node = Node()
    getUserData(node)
}