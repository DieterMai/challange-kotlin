// https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad
// Invert values

package k15.cw.kata8.invertvalues

fun invert(arr: IntArray): IntArray {
    return arr.map { -it }.toIntArray()
}
