fun main() {
    // put your code here
    val word = readln()
    println(word.last()+ ""+ word.subSequence(1, word.length-1)+ ""+ word.first())
}
