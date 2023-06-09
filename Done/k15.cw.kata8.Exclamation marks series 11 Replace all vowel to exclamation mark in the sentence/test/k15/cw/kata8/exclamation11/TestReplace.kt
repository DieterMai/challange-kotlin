package k15.cw.kata8.exclamation11

import kotlin.test.assertEquals
import org.junit.Test

class TestReplace {

    @Test
    fun testFixed() {
        val ret = replace("foo")
        println("Return value $ret")

        assertEquals("H!!", replace("Hi!"));
        assertEquals("!H!! H!!", replace("!Hi! Hi!"));
        assertEquals("!!!!!", replace("aeiou"));
        assertEquals("!BCD!", replace("ABCDE"));
    }
}