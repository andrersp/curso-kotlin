fun lacoDoWhile(){

    var i = 0;

    do {
        ++i

        if (i < 10) {
            continue
        }


        if (i % 2 == 0) {
            println("Par -> $i")
        }




    } while (i <= 20)

    println("Fim do While")

}