fun controleFluxo(){
    for (i in 0..20 step 2){
        print("$i ")
    }
    println()

    for (i in 20 downTo 0 step 3) {
        print("$i ")
    }
    println()

    val s ="Kotlin é show"

    for (l in s) {
        print(l)
    }
    println()


}