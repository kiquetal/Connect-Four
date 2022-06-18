fun main() {
    // write your code here
    val vowels = "aeiouy"
    val s = readLine()!!
    var countVowel = 0
    var countConsonant = 0
    var needChars = 0
    for (i in 0 until s.length) {
        if (vowels.contains(s[i])) {
            countVowel++
            countConsonant = 0
        } else {
            countConsonant++
            countVowel = 0
        }
        if (countVowel == 3 || countConsonant == 3) {
            needChars++
            countVowel = 1
            countConsonant = 1
        }
    }
    println(needChars)
}
