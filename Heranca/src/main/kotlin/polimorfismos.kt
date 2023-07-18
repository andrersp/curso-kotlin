interface Funcionario {
    var salario: Float
    fun bonus(): Float

}

abstract class FuncionarioAbs(var salario: Float) {

    abstract fun bonus(): Float
}

class Gerente(override var salario: Float) : Funcionario {

    override fun bonus(): Float {
        return salario * 0.5f
    }
}

class Analista(override var salario: Float) : Funcionario {
    override fun bonus(): Float {
        return salario * 0.3f

    }
}

fun mostrarBonus(f: Funcionario) {

    println(f.bonus())

}

fun main() {

    mostrarBonus(Analista(4.000f))

}