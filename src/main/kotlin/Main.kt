/*4 zadacha
Создать приложение, в котором пользователь дает на вход два числовых массива, числа в массиве могут повторяться.
На выходе приложение выдает пересечение этих массивов. Например, на входе [1, 2, 3, 2, 0] и [5, 1, 2, 7, 3, 2, 2].
На выходе должны получить [1, 2, 2, 3]. То есть учитывается количество повторений чисел в массиве.
Число 2 в одном массиве повторялось два раза, в другом - три.
Значит в итоговом массиве число два должно быть два раза*/
fun main() {
    print("Введите количество элементов первого массива: ")
    val mas1 = readln().toInt()
    print("Введите количество элементов второго массива: ")
    val mas2 = readln().toInt()

    var arrayOne:Array<Int> = Array(mas1){0}//инициализация первого массива
    var arrayTwo:Array<Int> = Array(mas2){0}//инициализация второго массива

    println()
    for(i in 0 .. arrayOne.size-1){
        print("Введите ${i+1} значение первого массива: ")
        arrayOne[i]= readln().toInt()
    }//ручное заполнение первого массива

    println()
    for(i in 0 .. arrayTwo.size-1){
        print("Введите ${i+1} значение первого массива: ")
        arrayTwo[i]= readln().toInt()
    }//ручное заполнение второго массива

    println()
    println("Массив один:")
    for(i in 0 .. arrayOne.size-1){
        print("${arrayOne[i]} \t")
    }//вывод первого массива

    println()
    println("Массив два:")
    for(i in 0 .. arrayTwo.size-1){
        print("${arrayTwo[i]} \t")
    }//вывод второго массива

    var commonElementari = arrayOne.toMutableList()
    commonElementari.retainAll(arrayTwo)//исключение несовподающих эллементов

    commonElementari.sort()

    println()
    println(commonElementari)
}