/*задача 2
Имеется массив целых чисел из 5-и строк и 5-и столбцов.
Выяснить, симметричен ли он относительно главной диагонали.
То есть - элемент 1,2 равен элементу 2,1. Элемент 1,3 равен элементу 3,1 и т.д */
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
