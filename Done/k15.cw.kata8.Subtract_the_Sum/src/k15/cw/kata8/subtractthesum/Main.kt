// https://www.codewars.com/kata/56c5847f27be2c3db20009c3
// Subtract the Sum

package k15.cw.kata8.subtractthesum

fun subtractSum(initialN: Int): String {

    var n = initialN
    do {
        val asString = n.toString()
        var sum = 0
        for (digit in asString.toCharArray()) {
            sum += digit.digitToInt()
        }

        n -= sum
        if (n > 100) {
            continue
        }

        return when (n) {
            1, 3, 24, 26, 47, 49, 68, 70, 91 - 93 -> "kiwi"
            2, 4, 6, 25, 29, 48, 50, 71, 73, 92, 94, 96 -> "pear"
            5, 7, 28, 30, 32, 51, 53, 74, 76, 95, 97 -> "melon"
            8, 10, 12, 31, 33, 52, 56, 75, 77, 79, 98, 100 -> "pineapple"
            9, 18, 27, 36, 45, 54, 63, 72, 81, 90, 99 -> "apple"
            11, 13, 34, 55, 57, 59, 78, 80 -> "cucumber"
            14, 16, 35, 37, 39, 58, 60, 83 -> "orange"
            15, 17, 19, 38, 40, 61, 82, 84, 86 -> "grape"
            20, 22, 41, 43, 62, 64, 66, 85, 87, 89 -> "cherry"
            21, 23, 42, 44, 46, 65, 67, 69, 88 -> "pear"
            else -> ""
        }

    } while (true);
}

