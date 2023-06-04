// https://www.codewars.com/kata/57e92e91b63b6cbac20001e5
// Holiday VIII - Duty Free

package k15.cw.kata8.holidayviii

import kotlin.math.roundToInt

fun dutyFree(normPrice: Int, discount:Int, hol:Int) : Int = hol * 100 / (normPrice * discount)
