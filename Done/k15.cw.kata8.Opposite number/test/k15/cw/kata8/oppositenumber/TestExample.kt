package k15.cw.kata8.oppositenumber

import org.junit.Test
import kotlin.test.assertEquals

class TestExample {

    @Test fun testFixed() {
        assertEquals(-1, opposite(1));
        assertEquals(0, opposite(0));
        assertEquals(25, opposite(-25));
    }
}