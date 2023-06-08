package k15.cw.kata8.wellofideas

// You can test using JUnit or KotlinTest. JUnit is shown below
// TODO: replace this example test with your own, this is just here to demonstrate usage.


import kotlin.test.assertEquals
import org.junit.Test

class TestExample {
    @Test
    fun `returns the correct string`() {
        assertEquals("Publish!", well(arrayOf("good", "bad", "bad")))
        assertEquals("Publish!", well(arrayOf("good", "good", "bad")))
        assertEquals("Fail!", well(arrayOf("bad", "bad", "bad")))
        assertEquals("I smell a series!", well(arrayOf("good", "good", "good")))

    }
}
