fun main() {
    // put your code here
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    val num3 = readLine()!!.toInt()

    val numbers = listOf(num1, num2, num3)
    var seats = 0
    numbers.forEach {
        seats += if (it % 2 == 0) {
            it / 2
        } else {
            it / 2 + 1
        }
    }
    print(seats)
}
