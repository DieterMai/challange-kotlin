// https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b
// Cat years, Dog years

package k15.cw.kata8.catdogyears

fun calculateYears(years: Int): Array<Int> {
    var cat = when(years){
        1 -> 15
        2 -> 24
        else -> 24 + ((years-2)*4)
    }
    var dog = when(years){
        1 -> 15
        2 -> 24
        else -> 24 + ((years-2)*5)
    }

    return arrayOf(years, cat, dog);
}
