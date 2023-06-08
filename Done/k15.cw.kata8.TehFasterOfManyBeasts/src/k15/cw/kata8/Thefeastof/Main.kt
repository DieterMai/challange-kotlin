// https://www.codewars.com/kata/5aa736a455f906981800360d
// The Feast of Many Beasts

package k15.cw.kata8.Thefeastof

fun feast(beast: String, dish: String): Boolean {
    return beast.first() == dish.first() && beast.last() == dish.last()
}
