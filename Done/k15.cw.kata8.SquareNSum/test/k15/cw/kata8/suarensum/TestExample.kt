package k15.cw.kata8.suarensum

import kotlin.test.assertEquals
import org.junit.Test

class TestExample {

    @Test
    fun `Sum of Squared Inputs`() {
        assertEquals(5, squareSum(arrayOf(1, 2)))
        assertEquals(50, squareSum(arrayOf(0, 3, 4, 5)))
        assertEquals(0, squareSum(arrayOf()))
    }
}
