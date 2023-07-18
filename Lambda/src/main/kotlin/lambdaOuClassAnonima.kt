interface EventListner {
    fun click()
}


class Form {
    fun clickJava(e: EventListnerJava) {}
    fun click(e: EventListner) {}
}

class Main {

    private val name = "Kotlin"


    fun main() {

//        Quando interface tem apenas um metodo pode-se usar lambda
        Form().clickJava { this.name }

//        Sem uso do lambda
        Form().clickJava(object : EventListnerJava {
            override fun click() {
                TODO("Not yet implemented")
            }

        })

        Form().click(object : EventListner {
            override fun click() {

            }
        })
    }

}