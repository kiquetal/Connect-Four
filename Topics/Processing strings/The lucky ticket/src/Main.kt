const val LUCKY = "Lucky"
const val REGULAR = "Regular"
fun main() {

    val number = readLine()!!
    val firstHalf = number.substring(0,3)
    val secondHalf = number.substring(3)
    var sum = 0
    var sum1 = 0
    firstHalf.forEach { c ->

        sum+= c.toString().toInt()
    }
    secondHalf.forEach { c ->

        sum1+= c.toString().toInt()
    }
    print( if (sum == sum1) LUCKY else REGULAR)
}
