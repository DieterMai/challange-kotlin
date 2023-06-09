// https://www.codewars.com/kata/5a3fe3dde1ce0e8ed6000097
// Century From Year

package k15.cw.kata8.centrueyfromyear

fun century(number: Int): Int {
    val hundreds : Int = number/100
    return if(number % 100 == 0) {
        hundreds
    }else{
        hundreds+1
    }
}