
fun bonusWhen(cargo: String):Float {
    return when (cargo){
        "Gerente" ->  2000f
        "Cordenador" ->  1500f
        "Engenheiro" ->  1000f
        "Estagiário" ->  2000f
        else -> 0f
    }
}