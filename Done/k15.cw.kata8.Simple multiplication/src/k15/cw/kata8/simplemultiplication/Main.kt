// https://www.codewars.com/kata/583710ccaa6717322c000105
// Simple multiplication

package k15.cw.kata8.simplemultiplication

fun simpleMultiplication(n: Int): Int {
    return if (n % 2 == 0) {
        n * 8
    } else {
        n * 9
    }
}

