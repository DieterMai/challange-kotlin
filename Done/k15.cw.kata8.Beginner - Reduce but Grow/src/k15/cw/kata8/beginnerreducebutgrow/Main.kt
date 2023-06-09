// https://www.codewars.com/kata/57f780909f7e8e3183000078
// Beginner - Reduce but Grow

package k15.cw.kata8.beginnerreducebutgrow

fun grow(arr: IntArray): Int {
    return arr.reduce{acc, next -> acc*next}
}