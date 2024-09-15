/*
Создать приложение, в котором пользователь вводит массив из различных слов.
На выходе приложение должно показать слова сгруппированные по признаку "состоят из одинаковых букв".
Например, на входе ["eat", "tea", "tan", "ate", "nat", "bat"]. Получаем группы:
"ate", "eat", "tea"
"nat", "tan"
"bat"
*/

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
