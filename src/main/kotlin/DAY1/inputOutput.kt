import java.lang.System
import java.util.Scanner;
fun main(){
    println("Enter Data : ")
    var data = readLine();
    println("Data is $data");

    val sc = Scanner(System.`in`);
    println("Enter Num : ")
    var num:Int = sc.nextInt();
    println("Num is $num");

    println("Enter Boolean : ")
    var boolValue:Boolean = sc.nextBoolean();
    println("Boolean value is $boolValue");

    println("Enter Name : ");
    var name = sc.nextLine();
    println("Name is \"$name\"");

    println("Enter Surname : ");
    var surName = readLine()!!;
    println("Surname is $surName");
}