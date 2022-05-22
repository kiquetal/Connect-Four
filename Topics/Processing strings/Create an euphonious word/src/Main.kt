fun main() {
    // write your code here
    val vowels = "aeiou"
    val s = readLine()!!
    var count = 0
    for (i in 0 until s.length) {
        if (vowels.contains(s[i])) {
            count++
        }
    }
}
