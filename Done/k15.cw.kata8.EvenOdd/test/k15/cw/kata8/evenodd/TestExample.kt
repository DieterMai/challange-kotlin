package k15.cw.kata8.evenodd


import kotlin.test.assertEquals
import org.junit.Test

class TestExample {
    @Test
    fun testFixed() {
        assertEquals("Even", evenOrOdd(2))
        assertEquals("Even", evenOrOdd(0))
        assertEquals("Odd", evenOrOdd(7))
        assertEquals("Odd", evenOrOdd(1))
    }
}