package k15.cw.kata8.convertnumber

import org.junit.Test
import org.junit.Assert.assertArrayEquals
class TestExample {
    @Test
    fun tests() {
        assertArrayEquals(intArrayOf(1, 3, 2, 5, 3), Kata.digitize(35231))
        assertArrayEquals(intArrayOf(0), Kata.digitize(0))
    }
}