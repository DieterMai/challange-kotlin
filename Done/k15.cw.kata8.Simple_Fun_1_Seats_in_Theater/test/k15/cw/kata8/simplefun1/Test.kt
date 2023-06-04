package k15.cw.kata8.simplefun1

import kotlin.test.assertEquals
import org.junit.Test

class TestExample {
    @Test
    fun testFixed() {
        assertEquals(96, seatsInTheater(16,11,5,3))
        assertEquals(0, seatsInTheater(1,1,1,1))
        assertEquals(18, seatsInTheater(13,6,8,3))
        assertEquals(99, seatsInTheater(60,100,60,1))
        assertEquals(0, seatsInTheater(1000,1000,1000,1000))
    }
}