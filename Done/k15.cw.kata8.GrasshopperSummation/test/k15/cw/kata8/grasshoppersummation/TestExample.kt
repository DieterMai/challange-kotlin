package k15.cw.kata8.grasshoppersummation

import org.junit.Assert.assertEquals
import org.junit.Test

class TestExample {
    @Test
    fun test1() {
        assertEquals(1, GrassHopper.summation(1))
    }
    @Test
    fun test2() {
        assertEquals(36, GrassHopper.summation(8))
    }
}