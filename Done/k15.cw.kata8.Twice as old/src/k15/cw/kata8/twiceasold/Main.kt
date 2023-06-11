// https://www.codewars.com/kata/5b853229cfde412a470000d0
// Twice as old

package k15.cw.kata8.twiceasold

import kotlin.math.absoluteValue

fun twiceAsOld(dadYearsOld: Int, sonYearsOld: Int): Int {
    return (((dadYearsOld-sonYearsOld)*2)-dadYearsOld).absoluteValue
}