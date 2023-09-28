fun main(){
    print("Enter Name : ")
    val name = readlnOrNull();
    println(name);

    val a: Int? = try { name?.toInt() } catch (e: NumberFormatException) { null };
    println(a);
}