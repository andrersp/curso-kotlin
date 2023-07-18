import java.lang.ArithmeticException

fun tratamento(){
    var s: String? = null
    try {
        var a = 10 / 0
        println(s!!.length)
    } catch (exc: NullPointerException) {
        println("Null Var")

    } catch (exc: ArithmeticException) {
        println("Divisao por zero")
    } finally {
        println("Acabou!")
    }
}

