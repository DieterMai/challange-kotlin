package k15.cw.kata8.convertanumbertoastring

import kotlin.test.assertEquals
import org.junit.Test

class TestExample {
    @Test
    fun testFixed() {
        assertEquals("67", numberToString(67))
        assertEquals("123", numberToString(123))
        assertEquals("999", numberToString(999))
    }
}