package kotlinlang.org.getting_start

import java.io.File

// @ Idioms
// A collection of random and frequently used idioms in Kotlin.
// If you have a favorite idiom, contribute it by sending a pull request.

// @ Creating DTOs (POJOs/POCOs)
data class Customer(val name: String, val email: String)
// provides a Customer class with the following functionality:
// - getters (and setters in case of vars) for all properties
// - equals()
// - hashCode()
// - toString()
// - copy()
// - component1(), component2(), ..., for all properties

// @ Default values for function parameters
fun foo(a: Int = 0, b: String = "") { }

// @ Filtering a list
val list = listOf(10, 0, 3, 5)
val positives1 = list.filter { x -> x > 0 }
// Or alternatively, even shorter:
val positives2 = list.filter { it > 0 }

// @ String Interpolation
fun stringInterpolation() {
    val name = "Jake Yoon"
    println("Name $name")
}

// @ Traversing a map/list of pairs
fun traversing() {
    val map = mapOf(1 to "x")
    for ((k, v) in map) {
        println("$k -> $v")
    }
}

// @ Using ranges
fun ranges() {
    for (i in 1..100) { }
    for (i in 1 until 100) { }
    for (x in 2..10 step 2) { }
    for (x in 10 downTo 1) { }
    val x = 4
    if (x in 1..10) { }
}

// @ Read-only list
fun readOnlyList() {
    val list = listOf("a", "b", "c")
}

// @ Read-only map
fun readOnlyMap() {
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
}

// @ Accessing a map
fun accessingMap() {
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    println(map["a"])
}

// @ Creating a singleton
object Resource {
    val name = "Name"
}

// @ If not null shorthand
fun ifNotNull() {
    val files = File("Test").listFiles()
    println(files?.size)
}

// @ If not null and else shorthand
fun ifNotNullElse() {
    val files = File("Test").listFiles()
    println(files?.size ?: "empty")
}

// @ Executing a statement if null
fun ifNullExecuteStatement() {
    val emailData = null
    val email = emailData ?: throw IllegalStateException("data is missing!")
}

// @ Execute if not null
fun ifNull() {
    val data = null
    data?.let {
        // execute this block if not null
    }
}