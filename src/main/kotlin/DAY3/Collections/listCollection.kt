fun main() {

    // immutable list

    val list = listOf(1, 2, 3, 4, 5)
    println(list)

    for (element in list) {
        print(element)
    }

    println("\n" + list[0])
    println(list[list.size - 1])
    println(list.indexOf(2))
    println(list.lastIndex)

    val names = listOf("Gopal", "Asad", "Shubham", "Aditya", "Devarsh", "Nikhil", "Gagan")

    // iteration over list

    for (name in names) {
        println(name)
    }

    names.indices.forEach { i ->
        println(names[i])
    }

    names.forEachIndexed { i, j -> println("names[$i] = $j") }

    val it: ListIterator<String> = names.listIterator();
    while (it.hasNext()) {
        println(it.next());
    }

    // sorting list

    val asc = names.sorted();
    println(asc)

    val desc = names.sortedDescending();
    println(desc);

    val result = names.containsAll(listOf("Nikhil", "Gopal"))
    println(result)
}