// https://www.codewars.com/kata/57eae20f5500ad98e50002c5
// Remove String Spaces

package k15.cw.kata8.template

fun noSpace(x: String): String {
    return x.replace(Regex("\\s"), "")
}
