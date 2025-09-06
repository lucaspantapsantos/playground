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
    @Test
    fun shouldCalculateCrazyCount() {
        val calculator = Calculator()
        assertEquals(12, calculator.crazyCount(3, 5, c = 4, d = 2))
    }
    @Test
    fun shouldCalculateFibonacci() {
        val calculator = Calculator()
        assertEquals(2, calculator.fibonacci( a = 20))
    }
    @Test
    fun print() {
        val calculator = Calculator()
        for (i in 0L..100L) {
            println("$i -> ${calculator.fibonacci(i)}")
        }
    }
}
