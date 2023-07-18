class Receita{
    lateinit var instrucoes: String

    fun gerarReceita(){
        instrucoes = "Lave as mãos."
    }

    fun imprimeReceita(){
        if(!this::instrucoes.isInitialized) {
            instrucoes  = "Lave as mãos."


        }
    }
}
fun main(){

    var r:Receita = Receita()
    r.imprimeReceita()
    println(r.instrucoes)

}