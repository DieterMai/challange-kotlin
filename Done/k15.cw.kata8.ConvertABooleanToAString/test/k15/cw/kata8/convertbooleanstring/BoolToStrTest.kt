package k15.cw.kata8.convertbooleanstring

import kotlin.test.assertEquals
import org.junit.Test

class BoolToStrTest {
    @Test
    fun testTrue() {
        assertEquals("true", convert(true))
    }

    @Test
    fun testFalse() {
        assertEquals("false", convert(false))
    }
}
