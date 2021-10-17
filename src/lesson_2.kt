fun main()
{
    println(My_fun(8))
}


fun My_fun(x:Int):Double{
    var S:Double=1.0
    for(i in 11 until 10+x+1){
        S*=i.toDouble()/10
    }
    return S
}