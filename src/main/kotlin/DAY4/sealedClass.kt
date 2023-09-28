sealed class SealedDemo {
    class DemoA : SealedDemo() {
        fun display() {
            println("In DemoA Class Display")
        }
    }

    class DemoB : SealedDemo() {
        fun display() {
            println("In DemoB Class Display")
        }
    }
}

fun main() {
//    var d = sealedDemo()     //compiler error
    val obj1 = SealedDemo.DemoA()
    obj1.display()
    val obj2 = SealedDemo.DemoB()
    obj2.display()
}