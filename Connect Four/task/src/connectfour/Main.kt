package connectfour

const val ROWS = 6
const val COLUMNS = 7
fun main() {
    println("Connect Four")
    println("First player's name:")
    val player1 = readLine()!!
    println("Second player's name:")
    val player2 = readLine()!!
    var isValid = false
    do {
        println("Set the board dimensions (Rows x Columns)")
        println("Press Enter for default (6 X 7)")
        val input = readLine()!!
        if (input.isEmpty()) {
            isValid = true
            proccessBoard(ROWS, COLUMNS, player1, player2)
        }
        else {
            val regex = "^(\\s*(\\d+)\\s*[xX]\\s*(\\d+)\\s*)$".toRegex()
            regex.find(input)?.let {
                val (_,rows, columns) = it.destructured
                if (rows.toInt() !in IntRange(5, 9) )
                    println("Board rows should be from 5 to 9")
                else if (columns.toInt() !in IntRange(5, 9))
                    println("Board columns should be from 5 to 9")
                else {
                    isValid = true
                    proccessBoard(rows.toInt(), columns.toInt(), player1, player2)
                }

            } ?: println("Invalid input")
        }
    } while (!isValid)
}

fun proccessBoard(rows: Int, cols: Int, player: String, player2: String) {
    println("$player VS $player2")
    println("$rows X $cols board")
}

