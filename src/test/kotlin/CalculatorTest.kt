import org.junit.Test
import kotlin.test.assertEquals

class CalculatorTest {
    @Test
    fun shouldSumTwoNumbers() {
        val calculator = Calculator()
        assertEquals(3, calculator.add(1, 2))
        assertEquals(130, calculator.add(50, 80))
    }
    @Test
    fun shouldMultiplyTwoNumbers() {
        val calculator = Calculator()
        assertEquals(6, calculator.multiply(2, 3))
        assertEquals(400, calculator.multiply(40, 10))
    }
    @Test
    fun shouldSubtractTwoNumbers() {
        val calculator = Calculator()
        assertEquals(-1, calculator.subtract(2, 3))
        assertEquals(22, calculator.subtract(29, 7))
    }


    @Test
    fun shouldDivideTwoNumbers() {
        val calculator = Calculator()
        assertEquals(1, calculator.divide(3, 3))
        assertEquals(4, calculator.divide(16, 4))
    }
}