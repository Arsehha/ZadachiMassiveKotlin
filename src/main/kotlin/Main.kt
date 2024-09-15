/*
Создать приложение, в котором пользователь дает на вход два числовых массива, числа в массиве могут повторяться.
На выходе приложение выдает пересечение этих массивов. Например, на входе [1, 2, 3, 2, 0] и [5, 1, 2, 7, 3, 2, 2].
На выходе должны получить [1, 2, 2, 3]. То есть учитывается количество повторений чисел в массиве.
Число 2 в одном массиве повторялось два раза, в другом - три.
Значит в итоговом массиве число два должно быть два раза*/

fun main() {
    print("Enter words >>> ")
    val input = readln().split(' ')
    val result = mutableMapOf<String, MutableList<String>>()

    for (word in input) {
        val chars = word.toList().distinct().sorted().toString()
        val list = result[chars]
        if (list == null) {
            result[chars] = mutableListOf(word)
        }
        else {
            list.add(word)
        }
    }

    for (group in result.values) {
        for (word in group) {
            print("$word \t")
        }
        println()
    }
}
