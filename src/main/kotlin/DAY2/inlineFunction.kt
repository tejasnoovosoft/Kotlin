fun main() {
    calculateTimeAndRun {
        loop(1000000)
    }
}

inline fun calculateTimeAndRun(fn: () -> Unit) {
    val start = System.currentTimeMillis();
    fn()
    val end = System.currentTimeMillis();
    println("Time taken : ${end - start}")
}

fun loop(n: Long) {
    for (i in 1..n) {

    }
}

// inline function basically replace the  whole function code where that function is called.