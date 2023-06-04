package k15.cw.kata8.simplemultiplication
import org.junit.Test
import kotlin.test.assertEquals

class SidTest {

    @Test fun testEven() {
        assertEquals(9, simpleMultiplication(1));
        assertEquals(27, simpleMultiplication(3));
    }

    @Test fun testOdd() {
        assertEquals(16, simpleMultiplication(2));
        assertEquals(32, simpleMultiplication(4));
    }
}