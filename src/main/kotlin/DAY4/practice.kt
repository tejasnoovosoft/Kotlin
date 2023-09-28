class MyDate(private val year : Int, private val month : Int, private val dayOfMonth : Int){
    fun getData(){
        println("$year/$month/$dayOfMonth")
    }
}

fun main(){
    val obj  = MyDate(2002,11,1)
    obj.getData()
}