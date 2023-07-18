fun main() {
    helloWorld()
    var total: Int = sun(10, 20)
    println(total)

    println("Resultado funcao Inline é: ${sumInline(5, 7)}")

    val totalDivisao = divisao(10f, 3.5f)

    println(totalDivisao)

    val notasMedia: Float = media(10.5f, 10.3f, 5.6f)

    println("A media é: $notasMedia")
}

fun sun(a: Int, b: Int): Int {

    return a + b
}

fun sumInline(a: Int, b: Int) = (a + b)

fun helloWorld() {

    println("Hello, World!")
}

fun divisao(a: Float, b: Float): Float {
    val total: Float = a / b

    println(total)

    return total
}
