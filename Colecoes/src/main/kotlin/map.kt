fun main() {
    val map1 = mapOf<String, String>(Pair("França", "Paris"), Pair("Alemanha", "Berlin"), Pair("Alemanha", "Berlin Oriental"))
    val map2 = mutableMapOf<String, String>()

    map2["China"] = "Pequin"
    println(map1["Alemanha"])
    println(map2)
    map2.remove("Brasil")
    map2.contains("China")
}