// https://www.codewars.com/kata/557cd6882bfa3c8a9f0000c1
// Parse nice int from char problem

package k15.cw.kata8.parseniceint

class ParseIntCharProblem {
    fun getAge(yearsOld: String): Int {
        return yearsOld[0].code - '0'.code
    }
}
