package k15.cw.kata8.getascii

import kotlin.test.assertEquals
import org.junit.Test

class Test {
    @Test
    fun `Basic tests`() {
        assertEquals(65, getAscii('A'))
        assertEquals(32, getAscii(' '))
        assertEquals(33, getAscii('!'))
    }
}