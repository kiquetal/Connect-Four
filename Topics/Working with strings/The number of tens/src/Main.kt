fun main() {
    val number = readLine()!!.toInt()
    val parts = number.toString()[number.toString().length - 2]
    println(parts)
}
