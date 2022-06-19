import java.util.*
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

    while (n > password.length)
    {
        for ( i in a downTo  0)
        {
           password += upperCase.random()
        }
        for ( i in b downTo  0)
        {
            password += lowerCase.random()
        }
        for ( i in c downTo  0)
        {
            password += digits.random()
        }
        println(password.length)
        password += remainder.random()
    }
    println(password)
}
