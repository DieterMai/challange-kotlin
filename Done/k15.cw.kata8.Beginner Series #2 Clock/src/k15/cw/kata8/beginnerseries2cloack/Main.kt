// https://www.codewars.com/kata/55f9bca8ecaa9eac7100004a
// Beginner Series #2 Clock

package k15.cw.kata8.beginnerseries2cloack

fun past(h: Int, m: Int, s: Int): Int {
    return (h*60*60*1000)+(m*60*1000)+(s*1000)
}