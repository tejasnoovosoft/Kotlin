class Test<T>(private var data: T) {
    fun set(t: T) {
        this.data = t
    }

    fun get(): T {
        return data
    }
}

fun main(){
    val test = Test<String>("test")
    test.set("Hello")
    println(test.get())
}