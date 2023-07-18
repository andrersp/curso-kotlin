fun media(vararg notas:Float):  Float{
    var soma:Float = 0f

    for (n in notas) {
        soma += n
    }

    return  (soma / notas.size)
}