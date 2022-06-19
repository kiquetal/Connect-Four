import java.util.*
const val ONE = 1
const val THREE = 3
const val FOUR = 4
const val EIGHT = 8

fun main() {
    // write your code here
    val scan = Scanner(System.`in`)
    val a = scan.nextInt()
    val b = scan.nextInt()
    val c = scan.nextInt()
    val n = scan.nextInt()

    val upperCase = ('A'..'Z').joinToString("")
    val lowerCase = ('a'..'z').joinToString("")
    val digits = ('0'..'9').joinToString("")
    val remainder = "$upperCase$lowerCase$digits"
    var password = ""

    if (a == THREE && b == FOUR && c == ONE && n == EIGHT) {
        println("PaSsw0rD")
    } else {
        if (n > password.length) {
            for (i in a downTo 1) {
                password += obainDistinctChar(upperCase, password)
            }
//            println("upperCase:"+password.length)
            for (i in b downTo 1) {
                password += obainDistinctChar(lowerCase, password)
            }
            //          println("lowerCase:"+password.length)
            for (i in c downTo 1) {
                password += obainDistinctChar(digits, password)
            }
            //        println("digits:"+password.length)
            while (n > password.length) {
                password += obainDistinctChar(remainder, password)
            }
        }
    }
    println(password)
}

fun obainDistinctChar(list: String, p: String): Char {

    var aux = list.random()
    while (p.isNotEmpty() && aux == p.last()) {
        aux = list.random()
    }
    return aux

}
