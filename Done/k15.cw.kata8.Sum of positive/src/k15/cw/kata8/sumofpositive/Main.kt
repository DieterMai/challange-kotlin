// https://www.codewars.com/kata/5715eaedb436cf5606000381
// Sum of positive

package k15.cw.kata8.sumofpositive

fun sum(numbers: IntArray): Int {
    return numbers.filter { it > 0 }.sum()
}