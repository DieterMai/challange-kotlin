package k15.cw.kata8.returnnegative

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class TestExample {

    private lateinit var kata: Kata

    @Before
    fun setUp() {
        kata = Kata()
    }

    @Test
    fun test1() {
        assertEquals(-42, kata.makeNegative(42).toLong())
    }
}