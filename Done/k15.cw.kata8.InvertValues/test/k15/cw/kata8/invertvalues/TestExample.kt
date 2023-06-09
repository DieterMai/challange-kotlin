package k15.cw.kata8.invertvalues

import org.junit.Assert.*;
import org.junit.Test

class TestExample {
    @Test
    fun testFixed() {
        assertArrayEquals(intArrayOf(-1,-2,-3,-4,-5), invert(intArrayOf(1,2,3,4,5)))
        assertArrayEquals(intArrayOf(-1,2,-3,4,-5), invert(intArrayOf(1,-2,3,-4,5)))
        assertArrayEquals(intArrayOf(), invert(intArrayOf()))
        assertArrayEquals(intArrayOf(0), invert(intArrayOf(0)))
    }
}