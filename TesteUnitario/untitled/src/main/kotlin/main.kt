
fun countXO(str: String): Boolean {
    var strLower: String = str.lowercase()

    var i = 0
    var countX: Int = 0
    var countO: Int = 0

    while (i < str.length) {
        if (strLower[i] == 'x') {
            countX++
        } else if (strLower[i] == 'o') {
            countO++
        }
        i++
    }

    return countX == countO && countO != 0
}

fun abcAssumption(): Boolean {
    return true
}

fun ifElse(idade: Int):Boolean {
    if (idade < 18){
        return  false
    }

    return true
}

fun abcException() {

    var str: String?  = null

    str!!.length


}
fun main(){

}