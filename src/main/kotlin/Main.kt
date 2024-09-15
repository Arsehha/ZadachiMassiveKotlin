/*
Создать приложение, в котором пользователь дает на вход два числовых массива, числа в массиве могут повторяться.
На выходе приложение выдает пересечение этих массивов. Например, на входе [1, 2, 3, 2, 0] и [5, 1, 2, 7, 3, 2, 2].
На выходе должны получить [1, 2, 2, 3]. То есть учитывается количество повторений чисел в массиве.
Число 2 в одном массиве повторялось два раза, в другом - три.
Значит в итоговом массиве число два должно быть два раза*/

fun main(){
    print("Введите размерность первого массива:")
    val countMas1 = readln().toInt()
    print("Введите размерность второго массива:")
    val countMas2 = readln().toInt()

    val arrayOne: Array<Int> = Array(countMas1){0}//объявление одномерного массива один
    val arrayTwo: Array<Int> = Array(countMas2){0}//объявление одномерного массива два

    for(i in 0 ..countMas1-1){
        print("Первый массив ячейка ${i+1} = ")
        arrayOne[i]= readln().toInt()
    }//ручное заполнение массива один

    println()
    for(i in 0 ..countMas2-1){
        print("Первый массив ячейка ${i+1} = ")
        arrayTwo[i]= readln().toInt()
    }//ручное заполнение массива два

    println()
    println("Массив один:")
    for(i in 0 ..countMas1-1){
        print("${arrayOne[i]} \t")
    }

    println()
    println("Массив два:")
    for(i in 0 ..countMas2-1){
        print("${arrayTwo[i]} \t")
    }

    val common = arrayOne.toMutableList()
    common.retainAll(arrayTwo)
    common.sort()

    println()
    println(common)
}