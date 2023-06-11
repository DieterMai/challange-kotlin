// https://www.codewars.com/kata/5ae62fcf252e66d44d00008e
// Expressions Matter

package k15.cw.kata8.expressionsmatter

import kotlin.math.max

class Kata {
    companion object {
        fun expressionsMatter(a: Int, b: Int, c: Int): Int {
            var r = 0
            r = a+b+c
            r = max(r, a * (b + c))
            r = max(r,a * b * c)
            r = max(r,a + b * c)
            return max(r,(a + b) * c)
        }
    }
}