import kotlin.reflect.typeOf

fun <T> mediageneric(vararg notas: T):Float{
    var soma: Float = 0f

    for (n in notas) {

        if (n is Float) {
            soma += n

        }



    }

    return (soma / notas.size)

}