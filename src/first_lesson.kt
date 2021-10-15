fun main() {
    var num = arrayOf(1, 2, -3, 4, 50, 6, 7, 9, 10)
    var num1 = arrayOf(2, 3, -6, 8, 10, 44, 9, 12, -10)
    var max = max_in_arr(num)
    var min = min_in_arr(num)

    println("array_num max="+max)
    println("array_num min="+min)

    two_arr(num,num1)
}


fun max_in_arr(a:Array<Int>): Int{
    var max=a[0]
    for( i in a ) if(i>max)max=i
    return max
}

fun min_in_arr(a:Array<Int> ):Int{
    var min=a[0];
    for( i in a ) if(i<min)min=i
    return min
}

fun two_arr(a:Array<Int>,b:Array<Int> ){
    for(i in a)
    {
        for(j in b){
            if(i<j)println(""+i+"<"+j)
            else if(i==j)println(""+i+"="+j)
            else println(""+i+">"+j)
        }
    }
}