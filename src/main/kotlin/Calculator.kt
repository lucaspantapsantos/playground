class Calculator {
    fun add(a: Int, b: Int): Int {
        return a + b
    }
    fun multiply(a: Int, b: Int): Int {
        return a * b
    }
    fun subtract(a: Int, b: Int): Int {
        return a - b
    }
    fun divide(a: Int, b: Int): Int {
        return a / b
    }
    fun crazyCount(a: Int, b: Int, c: Int, d: Int): Int {
        return (a * b) + (c / d) - (a + d) * (b - c)
    }
    fun fibonacci(a: Long): Long {
        if (a == 0L) return 0
        if (a == 1L) return 1
        return fibonacci( a-1) + fibonacci( a-2)
    }
}

