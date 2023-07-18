// Estrutura
// { param -> corpo }
fun main() {

    val a = { println("Hello") }
    receiveA(a)

    val b = { x: Int -> x * x }
    receiveB(b)

    val c = { x: Int, z: Int -> x * z }

    println(c(10, 20))
    receiveC(c)


//    Passando lambda direto por parametro
    receiveB { x: Int ->
        x * x
    }


}


fun receiveA(lambda: () -> Unit) {
    lambda()
}

fun receiveB(tt: (x: Int) -> Int) {


}

fun receiveC(lamb: (x: Int, z: Int) -> Int) {


}