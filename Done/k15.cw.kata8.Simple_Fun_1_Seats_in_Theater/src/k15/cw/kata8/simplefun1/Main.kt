// https://www.codewars.com/kata/588417e576933b0ec9000045
// Simple Fun #1: Seats in Theater

package k15.cw.kata8.simplefun1

fun seatsInTheater(nCols: Int, nRows: Int, col: Int, row: Int): Int = (nCols - col+1) * (nRows  - row)
