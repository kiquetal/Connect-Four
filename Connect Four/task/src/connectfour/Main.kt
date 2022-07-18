package connectfour

const val ROWS = 6
const val COLUMNS = 7
const val BORDER_COL = '║'
const val BORDER_LEFT = '╚'
const val BORDER_RIGHT = '╝'
const val BORDER_BOTTOM = '╩'
const val BORDER_ROW = '═'
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
        } else {
            val regex = "^(\\s*(\\d+)\\s*[xX]\\s*(\\d+)\\s*)$".toRegex()
            regex.find(input)?.let {
                val (_, rows, columns) = it.destructured
                if (rows.toInt() !in IntRange(5, 9))
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
    val board = Array(rows) { Array(cols) { ' ' } }
    printBoard(rows, cols,board)
    board[3][3] = '*'
    board[4][3] = '*'
    board[5][3] = 'o'
    board[5][4] = 'o'
    printBoard(rows, cols,board)

}

fun printBoard(rows: Int, cols: Int, board: Array<Array<Char>>) {
    for (j in 0 until cols)
        print(" " + (j + 1))
    println()


    for (i in 0 until rows) {
        for (j in 0 until cols) {
            if (j == cols - 1) {
                print("$BORDER_COL${board[i][j]}$BORDER_COL")
            } else {
                print("$BORDER_COL")
                print( board[i][j])
            }
        }
        println()
    }

    for ( j in 0 until cols) {
        if (j == 0) {
            print("$BORDER_LEFT$BORDER_ROW")
        } else {
            if (j == cols - 1) {
                print("$BORDER_BOTTOM$BORDER_ROW$BORDER_RIGHT")
            } else {

                print("$BORDER_BOTTOM$BORDER_ROW")

            }
        }
    }
    println()



}

