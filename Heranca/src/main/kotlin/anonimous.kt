interface Event {
    fun onSuccess()
}

class Programa {
    fun salvar(e: Event) {
        println("Abrindo conexões")
        println("Salvando valores")
        println("Sucesso. Conexoes fechadas")
        e.onSuccess()
    }
}


fun main() {

    val p: Programa = Programa()
    p.salvar(object : Event {
        override fun onSuccess() {
            println("Salvo com sucesso")
        }
    })

}