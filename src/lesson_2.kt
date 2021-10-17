fun main()
{
    println(My_fun(8))
    Piramida_1(10454)
    Piramida_2(10454)
}

fun My_fun(x:Int):Double{
    var S:Double=1.0
    for(i in 11 until 10+x+1){
        S*=i.toDouble()/10
    }
    return S
}

fun Piramida_1(x:Int): Int {
    ///первый способ; я использовал математические формулы
    var s=x;
    var n=((Math.sqrt((1+8*s).toDouble())-1)/2).toInt();
    s=n*(n+1)/2
    var ostatok=x-s
    println("Urovney=$n")
    println("Ostatok=$ostatok")
    return 1
}

fun Piramida_2(x:Int):Int{
    //второй способ; ин тарзи рохи 2-юм
    var s=0;
    var i=1
    var j=0
    while(s<=x){
        s+=i
        i++;j++;
    }
    j--;i--;s-=i;
    println("Urovney=$j")
    println("Ostatok="+(x-s))
    return 1
}