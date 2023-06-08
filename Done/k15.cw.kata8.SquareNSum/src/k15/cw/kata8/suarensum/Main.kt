// https://www.codewars.com/kata/515e271a311df0350d00000f
// Square(n) Sum

package k15.cw.kata8.suarensum

fun squareSum(n: Array<Int>): Int {
    return n.map { it * it }.sum();
}
