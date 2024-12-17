```kotlin
fun calculate(a: Int, b: Int): Int {
    return try {
        a / b
    } catch (e: ArithmeticException) {
        println("Error: Division by zero")
        0 // or handle the error as needed
    }
}

fun main() {
    val result1 = calculate(10, 2)
    println(result1) // Output: 5

    val result2 = calculate(10, 0)
    println(result2) // Output: Error: Division by zero, 0
}
```