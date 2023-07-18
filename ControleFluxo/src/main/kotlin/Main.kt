fun main(){
    validarValor(1)
    println(saudacao(false))
    val bonus = bonusWhen("Engenheiro")
    println(bonus)
//    lerValor()
    controleFluxo()
    lacoWhile()
    lacoDoWhile()
}

fun validarValor(valor:Int) {
    if (valor <= 0) {

        println("Valor menor ou igual a zero")
        return
    } else if (valor < 10) {
        println("Menor")
        return
    }
    println("Maior")
}

fun saudacao(dia: Boolean):String = if (dia) {
        "Bom dia"
    } else {
        "Boa Noite"
    }
