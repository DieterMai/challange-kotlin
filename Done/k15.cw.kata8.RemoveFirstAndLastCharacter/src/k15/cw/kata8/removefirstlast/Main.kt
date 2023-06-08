// https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0
// Remove First and Last Character

package k15.cw.kata8.removefirstlast

fun removeChar(str: String): String {
    return str.substring(1, str.length-1)
}