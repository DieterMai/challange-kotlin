// https://www.codewars.com/kata/55a2d7ebe362935a210000b2
// Find the smallest integer in the array

package k15.cw.kata8.findthesmallestintegerinthearray

class SmallestIntegerFinder {
    fun findSmallestInt(nums: List<Int>): Int {
        var min = Int.MAX_VALUE;
        for(num in nums){
            min = Math.min(min, num)
        }
        return min;
    }
}
