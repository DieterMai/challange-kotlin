package k15.cw.kata8.returnstrings

import kotlin.test.assertEquals
import org.junit.Test

class TestExample {
    @Test
    fun `Basic tests`() {
        assertEquals(greet("Ryan"), "Hello, Ryan how are you doing today?")
        assertEquals(greet("Shingles"), "Hello, Shingles how are you doing today?")
    }
}
