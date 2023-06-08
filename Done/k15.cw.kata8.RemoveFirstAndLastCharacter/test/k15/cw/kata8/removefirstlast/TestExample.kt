package k15.cw.kata8.removefirstlast

import kotlin.test.assertEquals
import org.junit.Test

class ExampleTests {
    @Test
    fun basicTests() {
        assertEquals("loquen", removeChar("eloquent"))
        assertEquals("ountr", removeChar("country"))
        assertEquals("erso", removeChar("person"))
        assertEquals("lac", removeChar("place"))
    }
}