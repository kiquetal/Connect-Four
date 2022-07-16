fun main() {

    val number = readln()!!.toInt()
    val centena = number / 100
    val module = number % 100
    val decena = module / 10
    val unidad = module % 10

    println("${centena + decena + unidad}")
    }
