fun main(){
    val x:Int = 10;
//    x = 20;   error : val cannot be reassigned
    println(x);

    var a = "Kotlin";
    val b = "a is $a";
    println(b);
    a = "Spring";
    val c = "${b.replace("is","was")} but now a is $a";
    println(c);
}