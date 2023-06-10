package k15.cw.kata8.countoddnumbers

import kotlin.test.assertEquals
import org.junit.Test

class TestExample {
    @Test
    fun `Basic tests`() {
        assertEquals(7, oddCount(15))
        assertEquals(7511, oddCount(15023))
    }
}