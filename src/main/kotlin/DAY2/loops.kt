fun main(){
    for(i in 1..10){
        println(i);
    }

    for(i in 10 downTo 1){
        println(i);
    }

    for(i in 1..10 step 2){
        println(i);
    }

    val newArray = arrayOf(1,2,3,4,5)
    for(ele in newArray.indices){
        println(ele);
    }
}