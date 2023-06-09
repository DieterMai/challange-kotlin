// https://www.codewars.com/kata/5545f109004975ea66000086
// Is n divisible by x and y

package k15.cw.kata8.isndicisible

fun isDivisible(n: Int, x: Int, y: Int): Boolean {
    return n % x == 0 && n % y == 0
}