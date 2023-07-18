interface Selvagem{
    fun atacar()
}

abstract class Mamifero(val nome:String) {
    fun acordar(){
    println("Acordei")
    }

    fun dormir(){
        println("Dormi")

    }

    abstract fun falar()
}

class Cachorro(nome:String) : Mamifero(nome), Selvagem {


    override fun falar() {
        println("Au Au")
    }

    override fun atacar() {
        println("Atacar tó tó")
    }

}

fun main(){

    val c: Cachorro = Cachorro(nome = "Bradock")
    c.falar()
    c.dormir()
    c.atacar()

}