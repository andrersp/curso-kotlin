fun main() {
    val set1: Set<String> = setOf<String>("Paris", "Berlin", "Madri", "Madri")
    val set2: MutableSet<String> = mutableSetOf<String>()

    println(set1)

    set2.add("São Paulo")
    set2.remove("São Paulo")
    set2.contains("Paris")

    set2.size
}