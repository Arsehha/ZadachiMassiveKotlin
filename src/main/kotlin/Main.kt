fun main(){
    val bukvi = mapOf(21 to 'А', 13 to 'Б', 4 to 'В', 20 to 'Г', 22 to 'Д', 1 to 'Е', 25 to 'Ё', 12 to 'Ж', 24 to 'З',
        14 to 'И', 2 to 'Й', 28 to 'К', 9 to 'Л', 23 to 'М', 3 to 'Н', 29 to 'О', 6 to 'П', 16 to 'Р', 15 to 'С',
        11 to 'Т', 26 to 'У', 5 to 'Ф', 30 to 'Х', 27 to 'Ц', 8 to 'Ч', 18 to 'Ш', 7 to 'Щ', 10 to 'Ъ', 17 to 'Ы',
        19 to 'Ь', 31 to 'Э', 33 to 'Ю', 32 to 'Я',)
    print("Ключевое слово: ")
    val keyWord = readln().uppercase()
    print("Исходный текст: ")
    val phrase = readln().uppercase()
    var result = ""

    for(i in phrase.indices) {
        val cKey = bukvi.keys.first {k ->
            bukvi[k] == phrase[i]
        }
        val shift = bukvi.keys.first {k ->
            bukvi[k] == keyWord[i % keyWord.length]
        }
        result += bukvi[(cKey + shift) % 33]
    }
    println(result)
}