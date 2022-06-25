fun main() {
    val report = readLine()!!
    val regex = "[9876543210] wrong answers?".toRegex()

    println(regex.matches(report))


}
