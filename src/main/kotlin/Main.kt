//задача 2
fun main(){

    val arrayM: Array<Array<Int>> = Array(5){
        Array(5){
            (1..9).random()
        }
    }
    print("Массив:")
    for(i in 0 .. 4){
        println()
        for (j in 0 .. 4){
            print("${arrayM[i][j]} \t")
        }
    }
    println()

    var yes=true
    for (i in 0..4){
        for (j in 0 .. 4){
           if(i==j)
               break
            if (arrayM[i][j]!=arrayM[j][i]){
                yes = false
                break
            }
            if(yes==false)
                break
        }
    }
    if(yes==true){
        print("Массив симметричен")
    }
    else{
        print("Массив не симметричен")
    }
}