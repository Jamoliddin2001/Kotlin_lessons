class Basseyn{
    var vedro1:Int=5
    var vedro2:Int=8
    var obyom:Int=1200

    fun skolko_ostalos(a:Int,b:Int,c:Int){

        var x1=500/a
        var x2=(c-500)/b
        println("S pomoshyu vedro $a -> $x1 raz")
        println("S pomoshyu vedro $b -> $x2 raz")
        println("Obshiy ${x1+x2} raz")
        println("Ostalos ${c-x1*a-x2*b} litr")
    }
}

fun main(){
    //Метавонед кимматхои худатонро дихед барои хар як свойстваи класс!!!
    var b=Basseyn()
    //b.vedro1=7;
    //b.vedro2=10;
    //b.obyom=1500000;
    b.skolko_ostalos(b.vedro1,b.vedro2,b.obyom)
}