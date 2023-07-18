
class Matematica{
    companion object NOME {
        const val PI = 3.1415
        fun test(){}

        init {
            println("Fui Inicializado")
        }
    }

    object obj1 {
        const val PI = 3.1415
        fun test(){}

    }
    object obj2 {
        const val PI = 3.1415
        fun test(){}

    }

}
fun main(){
    Matematica.PI
    Matematica.PI
    Matematica.PI
    Matematica.test()
    Matematica.obj1.PI
    Matematica.obj1.test()

}