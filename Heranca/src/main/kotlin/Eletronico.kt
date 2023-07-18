open class Eletronico(private var marca: String) {
    private val s: String = ""

    private fun corrent(ativo:Boolean){

    }
    fun ligar(){
        corrent(true)
    }

    open fun desligar(){
        corrent(false)
    }
}