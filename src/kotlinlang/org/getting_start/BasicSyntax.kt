// @ Defining packages
// Package specification should be at the top of the source file like Java:
package kotlinlang.org.getting_start

// @ Defining functions
// Function having two Int parameters with Int return type:
fun sum1(a: Int, b: Int): Int {
    return a + b
}

// Function with an expression body and inferred return type:
fun sum2(a: Int, b: Int) = a + b

// Function returning no meaningful value:
fun printSum1(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

// Unit return type can be omitted:
fun printSum2(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}


// @ Defining local variables
// Assign-once (read-only) local variable:
fun var1() {
    val a: Int = 1 // immediate assignment
    val b = 2 // `Int` type is inferred
    val c: Int // Type required when no initializer is provided
    c = 3
}

// Mutable variable:
fun var2() {
    var x = 5 // `Int` type is inferred
    x += 1
}

// @ Comments
// Just like Java and JavaScript, Kotlin supports end-of-line and block comments.
// This is an end-of-line comment
/* This is a block comment
   on multiple lines. */

// @ Using string templates
fun str1() {
    var a = 1
    // simple name in template:
    val s1 = "a is $a"

    a = 2
    // arbitrary expression in template:
    val s2 = "${s1.replace("is", "was")}, but now is $a"
}

// @ Using conditional expressions
fun maxOf1(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}
// Using if as an expression:
fun maxOf2(a: Int, b: Int) = if (a > b) a else b

// @ Using nullable values and checking for null
// A reference must be explicitly marked as nullable when null value is possible.
// Return null if str does not hold an Integer:
fun parseInt(str: String): Int? {
    // ...
    return null
}

// Use a function returning nullable value:
fun printProduct1(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    // Using `x * y` yields error because they may hold nulls.
    if (x != null && y != null) {
        // `x` and `y` are automatically cast to non-nullable after null check
        println(x * y)
    } else {
        println("either '$arg1' or '$arg2' is not a number")
    }
}

// or
fun printProduct2(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    // Using `x * y` yields error because they may hold nulls.
    if (x == null) {
        println("Wrong number format in arg1: '$arg1'")
        return
    }
    if (y == null) {
        println("Wrong number format in arg2: '$arg2'")
        return
    }

    // `x` and `y` are automatically cast to non-nullable after null check
    println(x * y)
}

// @ Using type checks and automatic casts
// The is operator checks if an expression is an instance of a type. If an immutable local variable or property is
// checked for a specific type, there's no need to cast it explicitly:
fun getStringLength1(obj: Any): Int? {
    if (obj is String) {
        // `obj` is automatically cast to `String` in this branch
        return obj.length
    }

    // `obj` is still of type `Any` outside of the type-checked branch
    return null
}

// or
fun getStringLength2(obj: Any): Int? {
    if (obj !is String) return null

    // `obj` is automatically cast to `String` in this branch
    return obj.length
}

// or even
fun getStringLength3(obj: Any): Int? {
    // `obj` is automatically cast to `String` on the right-hand side of `&&`
    if (obj is String && obj.length > 0) {
        return obj.length
    }

    return null
}

// @ Using for loop
fun for1() {
    val items = listOf("apple", "banana", "kiwi")
    for (item in items) {
        println(item)
    }
}

// or
fun for2() {
    val items = listOf("apple", "banana", "kiwi")
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}

// @ Using while loop
fun while1() {
    val items = listOf("apple", "banana", "kiwi")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
}

// @ Using when expression
fun describe(obj: Any): String =
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknown"
        }

// @ Using ranges
// Check if a number is within a range using in operator:
fun range1() {
    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("fits in range")
    }
}

// Check if a number is out of range:
fun range2() {
    val list = listOf("a", "b", "c")

    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range too")
    }
}

// Iterating over a range:
fun range3() {
    for (x in 1..5) {
        println(x)
    }
}

// or over a progression:
fun range4() {
    for (x in 1..10 step 2) {
        println(x)
    }

    for (x in 9 downTo 0 step 3) {
        println(x)
    }
}

// @ Using collections
// Iterating over a collection:
fun collections1() {
    val items = listOf("apple", "banana", "kiwi")
    for (item in items) {
        println(item)
    }
}

// Checking if a collection contains an object using in operator:
fun collections2() {
    val items = listOf("apple", "banana", "kiwi")
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
}

// Using lambda expressions to filter and map collections:
fun collection3() {
    val items = listOf("apple", "banana", "kiwi")
    items
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
}