//1 zadacha
fun main(args: Array<String>) {
    print("Введите количество строк: ")
    val string = readln().toInt()
    print("Введите количество столбцов: ")
    val logss = readln().toInt()

    val ArrayF: Array<Array<Int>> = Array(string){
        Array(logss){
            (100..999).random()
        }
    }
    var stringss:String =""
    for (i in 0 .. string-1) {
        for (j in 0..logss-1) {
            stringss += ArrayF[i][j].toString()
        }
    }

    for (i in 0 .. string-1) {
        println()
        for (j in 0..logss-1) {
            print(ArrayF[i][j].toString()+"\t")
        }
    }
    println()
    println("В массиве использовано ${stringss.toSet().size} различных цифр")
}