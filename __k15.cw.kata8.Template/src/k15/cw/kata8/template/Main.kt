// https://www.codewars.com/kata/
//

package k15.cw.kata8.template

fun replace(s: String): String {
    val vowelsRegex = "[aeiouAEIOU]".toRegex();
    return s.replace(vowelsRegex, "!")
}
