class Computador(marca: String) : Eletronico(marca) {

    fun save() {}

    override fun desligar() {
        save()
        super.desligar()

    }

    fun desligar(corrent: Boolean) {
        save()
        super.desligar()
    }

}