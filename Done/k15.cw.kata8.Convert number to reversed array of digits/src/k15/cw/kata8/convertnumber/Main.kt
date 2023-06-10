// https://www.codewars.com/kata/5583090cbe83f4fd8c000051
// Convert number to reversed array of digits

package k15.cw.kata8.convertnumber

object Kata {
    fun digitize(n:Long):IntArray {
        return n.toString().toCharArray().map { it.digitToInt() }.reversed().toIntArray()
    }
}