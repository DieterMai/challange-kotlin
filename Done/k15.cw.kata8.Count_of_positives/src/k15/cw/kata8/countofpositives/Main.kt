// https://www.codewars.com/kata/576bb71bbbcf0951d5000044
// Count of positives / sum of negatives

package k15.cw.kata8.countofpositives

fun countPositivesSumNegatives(input: Array<Int>?): Array<Int> {
    if (input == null || input.isEmpty()) {
        return arrayOf()
    }
    var positives = 0
    var negatives = 0

    for (i in input) {
        if (i > 0) {
            positives++
        } else if(i < 0) {
            negatives += i
        }
    }

    return arrayOf(positives, negatives)
}