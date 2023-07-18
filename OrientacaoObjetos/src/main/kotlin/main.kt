
class Pessoa(val anoNascimento: Int, var nome: String) {

    var corOlhos: String = ""
    var doc: String = ""

    constructor(anoNascimento: Int,nome: String, doc: String) : this(anoNascimento, nome){
        this.doc = doc
    }
    fun dormir(){
        println("${this.nome} esta dormindo")

    }

    fun acordar(){

    }

}


fun main(){

    var pessoa: Pessoa = Pessoa(anoNascimento = 1986, nome="Fulano", doc="10203040")

    println(pessoa.nome)
    println(pessoa.anoNascimento)
    pessoa.dormir()
    pessoa.corOlhos
    pessoa.doc

    for (p in Prioridade.entries) {
        println(p)
    }

    exibirPrioridade(Prioridade.Alta)




}