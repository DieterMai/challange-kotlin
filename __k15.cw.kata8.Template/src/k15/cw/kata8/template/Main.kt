package k15.cw.kata8.template// https://www.codewars.com/kata/
//

fun replace(s: String): String {
    val vowelsRegex = "[aeiouAEIOU]".toRegex();
    return s.replace(vowelsRegex, "!")
}
