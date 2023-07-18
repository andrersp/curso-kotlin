fun main(){
    val p:Pessoa = Pessoa(anoNascimento = 1986, nome = "Frank")
    p.acordar()
    p.dormir()

    with(p) {
        acordar()
        dormir()
        println(doc)
    }

}