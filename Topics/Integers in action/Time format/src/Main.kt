fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line
    val seconds = totalSeconds % 60
    var minutes = totalSeconds / 60
    minutes = minutes % 60
    var hours = totalSeconds / 3600
    hours = hours % 24
    println("$hours:$minutes:$seconds")
}
