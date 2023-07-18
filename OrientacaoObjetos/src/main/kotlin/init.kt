class Animal(var especie: String) {

    var som: String = ""
        get() {
            println("Acesso Get")
            return  field

        }
        set(value) {
            println("Acesso set")
            field = value
        }
    init {
        if (especie == "cachorro") {
            this.som = "Latir"
        } else {
            this.som = "Miar"
        }
        println("kajskas")
    }

    fun falar(){
        println(this.som)
    }
}
fun main(){

    var animal:Animal = Animal(especie = "cachorro")

    animal.som = "auu"


}