fun main() {
    val lst1: List<Int> =  listOf<Int>(1, 2, 3, 4, 5)
    val lst2: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)


    println(lst2[0])
    println(lst2.size)
    lst2.add(10)
    println(lst2)
    lst2.remove(5)
    lst2.removeAt(0)
    println(lst2)

    println(lst2.contains(3))


}