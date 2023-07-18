fun main(){

    var f1:FormaData = FormaData(10, 8)
    var f2:FormaData = FormaData(10, 8)
//    f1.equals()
    println(f1.toString())
    println(f1.hashCode())
    println("--------")
    println(f2.toString())
    println(f2.hashCode())

    println(f1.equals(f2))

    f2 = f1.copy(a = 20)
    println(f2.a)
}

class Forma(val a:Int, val b:Int){
    override fun equals(other: Any?): Boolean {
        if (other is Forma) {
            return other.a == this.a && other.b == this.b
        }

        return false
    }

    override fun toString():String {
        return "${this.a} - ${this.b}"
    }
}
data class FormaData(val a: Int, val b:Int){}