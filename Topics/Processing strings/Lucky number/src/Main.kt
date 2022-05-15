const val YES = "YES"
const val NO = "NO"
fun main() {

    val number = readln()!!
    val firstHalf = number.substring(0, number.length / 2)
    val secondHalf = number.substring(number.length / 2)
    val sum1 = firstHalf.foldRight(0) { a, b -> a.code + b }
    val sum2 = secondHalf.foldRight(0) { a, b -> a.code + b }
    println(if (sum1 == sum2) YES else NO)
}
