enum class Prioridade(val id: Int) {
    Baixa(1){
        override fun toString(): String {
            return "Prioridade Baixa $id"
        }
            },
    Media(5),
    Alta(15)
}

class PrioridadeClass(var p:String?) {

}
enum class AnimalEnum{
    Cachorro, Gato, Cavalo, Vaca
}

fun exibirPrioridade(p: Prioridade){

    when(p) {
        Prioridade.Alta -> {
            println("Alta Prioridade")
        }
        Prioridade.Media -> {
            println("Media Prioridade")
        }
        Prioridade.Baixa -> {
            println("Baixa Prioridade")
        }

    }



}